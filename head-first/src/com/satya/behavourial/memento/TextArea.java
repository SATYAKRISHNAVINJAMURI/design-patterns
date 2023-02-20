package com.satya.behavourial.memento;

public class TextArea {
    private String text;

    public TextArea(String text) {
        this.text = text;
    }

    public void concat(String text) {
        this.text = this.text.concat(text);
    }

    public Memento getSnapshot() {
        return new Memento(text);
    }

    public String getText() {
        return this.text;
    }

    public static class Memento {
        private String text;
        public Memento(String text) {
            this.text = text;
        }
        public String getText() {
            return text;
        }
    }
}
