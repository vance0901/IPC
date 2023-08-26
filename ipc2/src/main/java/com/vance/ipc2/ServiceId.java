package com.vance.ipc2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//元注解： 注解上的注解
//保留
@Target(ElementType.TYPE)//目标
@Retention(RetentionPolicy.RUNTIME)//给反射用
public @interface ServiceId {

    String value();
}
