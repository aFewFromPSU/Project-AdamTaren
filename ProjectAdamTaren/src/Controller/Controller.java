/*
 * 
 */
package Controller;

import Model.Model;
import View.View;

/**
 *
 * @author Adam S Miller
 */
public class Controller {
    
    Model model1;
    View view1;
    
    public Controller(Model model, View view){
        
        this.model1 = model;
        this.view1 = view;
        
        model1.printHello();
        
    }
    
}
