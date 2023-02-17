package com.satya.creational.abstractfactory;

public class AsusCompany extends Company {
    @Override
    protected Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    protected Monitor createMonitory() {
        return null;
    }
}
