package com.satya.behavourial.command;

import java.util.List;

public class CommandClient {
    public static void main(String[] args) {
        Button button = new Button();
        Command command = new SwitchLightsCommand(List.of(new Light()));
        button.setCommand(command);
        button.executeCommand();
    }
}
