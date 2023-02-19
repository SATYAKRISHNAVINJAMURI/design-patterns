package com.satya.behavourial.command;

import java.util.List;

public class SwitchLightsCommand implements Command {
    private List<Light> lights;

    SwitchLightsCommand(List<Light> lights) {
        this.lights = lights;
    }
    @Override
    public void execute() {
        lights.forEach(Light::pressSwitch);
    }
}
