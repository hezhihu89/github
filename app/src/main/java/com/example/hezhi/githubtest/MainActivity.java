package com.example.hezhi.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //添加github方法
    private void github() {

        test();
    }

    //添加test 方法
    private void test() {
        github();
    }

}
