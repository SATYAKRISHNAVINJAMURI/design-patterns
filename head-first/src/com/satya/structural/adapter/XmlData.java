package com.satya.structural.adapter;

public class XmlData {
    public String type;
    public String name;
    public XmlData(String name) {
        this.type = "XML";
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
