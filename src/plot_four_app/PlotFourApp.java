package plot_four_app;

//JAVA FX DEPENDENCIES
import javafx.application.Application; //Class needed for the Application
import javafx.stage.Stage; //Class needed for window(s) of the application
import javafx.scene.image.Image;  

import assets.AssetsManager;
import contexts.Controller;

//Class responsible for creating the main stage/window
public class PlotFourApp extends Application {
	
	private final double WIDTH = 1000;
	private final double HEIGHT = 500;
	
	private Port port = new Port(WIDTH, HEIGHT, new AssetsManager(), new Controller());
	
	public PlotFourApp() {
	}
	
	@Override
	public void start(Stage window) {
		window.getIcons().add(new Image("/assets/Plot_Four.png"));
		window.setTitle("Plot Four");
		window.setResizable(false);
		
		port.controller.port = port;
		
		window.setScene(port);
		window.show();
	}
	
	public static void main (String[] args) {
		Application.launch(args);
    }  
  
}  
