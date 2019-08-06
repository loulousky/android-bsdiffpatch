//
// Created by admin on 2019/8/6.
//

#ifndef MYAPPLICATION_MYPATCH_H
#define MYAPPLICATION_MYPATCH_H
#include <jni.h>
#include <string.h>
#include <stdio.h>
JNIEXPORT void JNICALL
Java_com_example_liuhai_myapplication_DifPachUtils_pachMyFile(JNIEnv *env, jclass type,
                                                              jstring oldapk_, jstring newapk_,
                                                              jstring pachFile_);
#endif //MYAPPLICATION_MYPATCH_H
