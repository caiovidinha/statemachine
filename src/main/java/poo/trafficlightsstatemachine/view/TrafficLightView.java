/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.trafficlightsstatemachine.view;

import poo.trafficlightsstatemachine.states.TrafficLightState;
import poo.trafficlightsstatemachine.model.TrafficLightModel;


import javax.swing.*;
import java.awt.*;

// TrafficLightView class handles the graphical representation
public class TrafficLightView extends JPanel {
    private final TrafficLightModel model;

    public TrafficLightView(TrafficLightModel model) {
        this.model = model;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the traffic light with the current state
        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);

        int circleSize = 50;
        int centerX = width / 2 - circleSize / 2;
        int centerY = height / 2 - circleSize / 2;

        g.setColor(model.getCurrentState() == TrafficLightState.RED ? Color.RED : Color.GRAY);
        g.fillOval(centerX, centerY - 50, circleSize, circleSize);

        g.setColor(model.getCurrentState() == TrafficLightState.YELLOW ? Color.YELLOW : Color.GRAY);
        g.fillOval(centerX, centerY, circleSize, circleSize);

        g.setColor(model.getCurrentState() == TrafficLightState.GREEN ? Color.GREEN : Color.GRAY);
        g.fillOval(centerX, centerY + 50, circleSize, circleSize);
    }
}
