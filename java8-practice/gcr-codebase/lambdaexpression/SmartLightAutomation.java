package com.bridgelabz.lambdaexpression;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartLightAutomation {
    public static void main(String[] args) {

        // Motion detected
        LightAction motionTrigger = () ->
                System.out.println("Lights ON at full brightness");

        // Night time
        LightAction nightTrigger = () ->
                System.out.println("Lights ON at dim mode");

        // Voice command
        LightAction voiceTrigger = () ->
                System.out.println("Lights turned ON by voice command");

        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}
