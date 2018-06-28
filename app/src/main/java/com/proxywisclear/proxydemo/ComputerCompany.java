package com.proxywisclear.proxydemo;

import android.util.Log;

public class ComputerCompany implements ComputerInterface{
    @Override
    public void sale() {
        Log.d("Proxy","Computer---------sale--------");
    }

    @Override
    public void service() {
        Log.d("Proxy","Computer---------service--------");

    }
}
