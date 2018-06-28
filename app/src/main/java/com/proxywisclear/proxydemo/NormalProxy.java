package com.proxywisclear.proxydemo;

public class NormalProxy implements ComputerInterface{
    private ComputerInterface computer;

    public NormalProxy(ComputerInterface computer) {
        this.computer = computer;
    }

    @Override
    public void sale() {
        computer.sale();
    }

    @Override
    public void service() {
        computer.service();
    }
}
