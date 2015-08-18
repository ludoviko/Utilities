package com.lam.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})

public @interface Note {
  String author() default "Ludoviko Azuaje";
  String note();
  boolean tested() default false;
 // int version();
}
