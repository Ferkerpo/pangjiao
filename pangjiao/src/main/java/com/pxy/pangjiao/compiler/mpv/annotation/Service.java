package com.pxy.pangjiao.compiler.mpv.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by pxy on 2018/3/13.
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Service {
}
