package poo.trafficlightsstatemachine.controller;

import poo.trafficlightsstatemachine.model.TrafficLightModel;
import poo.trafficlightsstatemachine.view.TrafficLightView;

import javax.swing.*;
import java.awt.event.ActionEvent;

// TrafficLightController class manages interactions between the model and view
public class TrafficLightController {
    private final TrafficLightModel model;
    private final TrafficLightView view;
    private Timer timer;

    public TrafficLightController(TrafficLightModel model, TrafficLightView view) {
        this.model = model;
        this.view = view;

        // Create a timer to control state transitions
        timer = new Timer(3000, (ActionEvent e) -> {
            model.nextState();
            view.repaint();
            int delay;
            delay = switch (model.getCurrentState()) {
                case RED -> 4000;
                case YELLOW -> 1000;
                case GREEN -> 3000;
                default -> 2000;
            }; // 4 seconds for red
            // 1 second for yellow
            // 3 seconds for green
            // Default to 2 seconds
            timer.setDelay(delay);
            timer.restart(); 
        });
        timer.setInitialDelay(3000);
        timer.start();
    }
}
