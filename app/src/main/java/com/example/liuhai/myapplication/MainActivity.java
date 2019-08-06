package com.example.liuhai.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DifPachUtils.pachMyFile("本身的APK","目标APK的地址","差分的APK文件从服务器上获取");

    }


}
