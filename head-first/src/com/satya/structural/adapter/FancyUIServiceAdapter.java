package com.satya.structural.adapter;

public class FancyUIServiceAdapter implements UIService {

    private FancyUIService uiService;

    public FancyUIServiceAdapter() {
        uiService = new FancyUIServiceImpl();
    }
    @Override
    public void displayMenu(XmlData xmlData) {
        uiService.displayMenu(coverXMLTOJson(xmlData));
    }

    @Override
    public void displayProfile(XmlData xmlData) {
        uiService.displayProfile(coverXMLTOJson(xmlData));
    }

    private JsonData coverXMLTOJson(XmlData xmlData) {
        return new JsonData(xmlData.getName());
    }

    public static void main(String[] args) {
        XmlData xmlData = new XmlData("Chicken");
        UIService oldService = new UIServiceImpl();
        oldService.displayMenu(xmlData);

        UIService newService = new FancyUIServiceAdapter();
        newService.displayMenu(xmlData);
    }
}
