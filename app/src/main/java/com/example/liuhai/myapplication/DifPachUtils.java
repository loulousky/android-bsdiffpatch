package com.example.liuhai.myapplication;

/**
 * 作者：liuhai
 * 时间：2019/8/6:17:05
 * 邮箱：185587041@qq.com
 * 说明：
 */
public class DifPachUtils {
    static {

        System.loadLibrary("mypatch");
    }
    public static native void  pachMyFile(String oldapk,String newapk,String pachFile);


}
