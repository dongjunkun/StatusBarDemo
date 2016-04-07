package com.yyydjk.statusbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.one, R.id.two, R.id.three, R.id.four})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.one:
                startActivity(new Intent(this, OneActivity.class));
                break;
            case R.id.two:
                startActivity(new Intent(this, TwoActivity.class));
                break;
            case R.id.three:
                startActivity(new Intent(this, ThreeActivity.class));
                break;
            case R.id.four:
                startActivity(new Intent(this, FourActivity.class));
                break;
        }
    }
}
