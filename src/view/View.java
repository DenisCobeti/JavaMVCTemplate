/*
 * Using Java MVC templabe by DenisCobeti
 */

package view;

import controller.ViewListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class View implements ActionListener, Observer{
    
    private final ViewListener listenerUI;

    public View(ViewListener listenerUI) {
        this.listenerUI = listenerUI;
    }

    /* events inside the interface will be processed here */
    @Override
    public void actionPerformed(ActionEvent event) {
        switch (event.getActionCommand()){
            // example structure
            case "Event":
                // process event and send signal to listener
                listenerUI.producedEvent(ViewListener.Event.EVENT_1, this);
                break;
        }
    }

    /* Update is called by the controller to update the View */
    @Override
    public void update(Observable observable, Object arg) {
        if (arg == null){
            // function
        } else if(arg instanceof Object){
            // function
        }
    }
}
