package com.satya.behavourial.memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<TextArea.Memento> mementos;
    private TextArea textArea;
    private int index;

    public String getText() {
        return textArea.getText();
    }

    public Editor() {
        this.mementos = new ArrayList<>();
        this.textArea = new TextArea("");
        this.index = -1;
    }

    public void addText(String text) {
        mementos.add(textArea.getSnapshot());
        index++;
        textArea.concat(text);
    }
    public void undo() {
        if(index >= 0) {
            this.textArea = new TextArea(mementos.get(index--).getText());
        }
    }

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.addText("Satya");
        editor.addText("Krishna");
        System.out.println(editor.getText());
        editor.undo();
        System.out.println(editor.getText());
        editor.addText("Loves");
        System.out.println(editor.getText());
        editor.addText("Anu");
        System.out.println(editor.getText());
        editor.undo();
        editor.undo();
        System.out.println(editor.getText());
    }
}
