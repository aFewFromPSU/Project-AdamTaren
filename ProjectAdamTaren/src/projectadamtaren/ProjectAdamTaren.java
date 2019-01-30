/*
 * Adam S Miller and Taren LAstName 2019
 */
package projectadamtaren;

//import other Package.Class
import Model.Model;
import View.View;
import Controller.Controller;

/**
 *
 * @author Adam S Miller and Taren LastName 2019
 */
public class ProjectAdamTaren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Adam is
        //Create an instance for Model and View, then send then to Controller so that controller can manipulate them.
        Model model1 = new Model();
        View view1 = new View();
        Controller controller1 = new Controller(model1, view1);
    }
    
}

//test code test 2