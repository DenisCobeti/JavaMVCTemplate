/*
 * Using Java MVC templabe by DenisCobeti
 */

package controller;

import model.Model;
import view.View;

public class Controller implements ViewListener{

    
    private final Model model;
    private final View view;
    
    public Controller(String[] args) {
        
        view = new View(this);
        model = new Model();
        
    }
    
    /* 
    * All the events will be managed in this function
    * It is recommended to assign the correct object type
    * or to use Tuple when a single object isnt enough
    */
    @Override
    public void producedEvent(Event event, Object obj) {
        switch (event) {
            case EVENT_1:
                // write code to execute when EVENT_1 is triggered and update view
                break;
            case EVENT_2:
                // write code to execute when EVENT_2 is triggered and update view
                view.update(model, obj);
                break;
        }
    }
    
    public static void main(String[] args) {
        new Controller(args);
    }
}
