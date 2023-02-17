package com.satya.creational.abstractfactory;

public class MsuCompany extends Company {
    @Override
    protected Gpu createGpu() {
        return new MSUGpu();
    }

    @Override
    protected Monitor createMonitory() {
        return new MSUMonitor();
    }
}
