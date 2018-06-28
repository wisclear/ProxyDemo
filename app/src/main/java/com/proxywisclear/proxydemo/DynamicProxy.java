package com.proxywisclear.proxydemo;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {


    Object targetObj;

    public Object newProxyInstance(Object targetObj){
        this.targetObj = targetObj;
        return Proxy.newProxyInstance(targetObj.getClass().getClassLoader(),
                targetObj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret;
        Log.i("Proxy", "method name:Computer." + method.getName());
        ret = method.invoke(targetObj, args);
        return ret;
    }
}
