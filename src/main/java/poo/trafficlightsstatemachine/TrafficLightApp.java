
package poo.trafficlightsstatemachine;

import poo.trafficlightsstatemachine.model.TrafficLightModel;
import poo.trafficlightsstatemachine.view.TrafficLightView;
import poo.trafficlightsstatemachine.controller.TrafficLightController;

import javax.swing.*;

public class TrafficLightApp {
    public static void main(String[] args) {
        TrafficLightModel model = new TrafficLightModel();
        TrafficLightView view = new TrafficLightView(model);
        TrafficLightController controller = new TrafficLightController(model, view);

        JFrame frame = new JFrame("Traffic Light Simulator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 400);
        frame.add(view);
        frame.setVisible(true);
    }
}
