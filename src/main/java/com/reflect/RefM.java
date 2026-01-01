package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefM {

public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
    Ref rr = new Ref();
    //System.out.println(rr.b);
    Class cc = rr.getClass().getSuperclass();
    System.out.println(cc.getSimpleName());
    Field ff = cc.getField("ab");
    Object value = ff.get(rr);
    System.out.println(value);
}

}
