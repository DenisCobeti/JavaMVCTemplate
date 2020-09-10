/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author darkm
 */
public interface ViewListener {
    
    // Add various events that will be triggerd throughout the program
    public enum Event {EVENT_1, EVENT_2}
    
    public void producedEvent(Event event, Object obj);
}
