package com.satya.creational.abstractfactory;

public abstract class Company {
    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }
    protected abstract Gpu createGpu();

    public Monitor assembleMonitor() {
        Monitor monitor = createMonitory();
        monitor.assemble();
        return monitor;
    }

    protected abstract Monitor createMonitory();
}
