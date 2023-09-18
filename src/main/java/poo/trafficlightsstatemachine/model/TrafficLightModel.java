/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.trafficlightsstatemachine.model;
import poo.trafficlightsstatemachine.states.*;
// TrafficLightModel class represents the state machine
public class TrafficLightModel {
    public static TrafficLightState currentState;

    public TrafficLightModel() {
        // Initialize the traffic light with the initial state (Red)
        currentState = TrafficLightState.RED;
    }

    // Transition to the next state
    public void nextState() {
        switch (currentState) {
            case RED -> currentState = TrafficLightState.GREEN;
            case YELLOW -> currentState = TrafficLightState.RED;
            case GREEN -> currentState = TrafficLightState.YELLOW;
        }
    }

    // Get the current state of the traffic light
    public TrafficLightState getCurrentState() {
        return currentState;
    }
}

