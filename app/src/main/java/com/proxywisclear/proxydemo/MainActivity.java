package com.proxywisclear.proxydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //普通代理
        ComputerCompany computerCompany = new ComputerCompany();
        NormalProxy proxy = new NormalProxy(computerCompany);
        proxy.sale();
        proxy.service();


        //动态代理
        DynamicProxy dynamicProxy = new DynamicProxy();
        ComputerInterface computer = (ComputerInterface) dynamicProxy.newProxyInstance(computerCompany);
        computer.sale();
        computer.service();

    }
}
