package org.plot_four_app;

import java.util.HashMap;

import javafx.scene.Parent;
import org.plot_four_app.Port;

//This class handles switching or interactions between different contexts
public class Controller {
	
	public Port port = null;
	public HashMap<String, Parent> contexts = null;
	
	public void changeContext(String context) {
		port.setRoot(contexts.get(context));
	}
}