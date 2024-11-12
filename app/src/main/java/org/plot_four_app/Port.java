package org.plot_four_app;

import java.util.HashMap;

import org.plot_four_app.AssetsManager;

import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.paint.Color;

import org.plot_four_app.Controller; //Needed to control interactions between different contexts
import org.plot_four_app.contexts.PlotFour;
import org.plot_four_app.contexts.StartMenu;
import org.plot_four_app.contexts.PauseMenu;


//The scene used to store different contexts of the Plot Four app
public class Port extends Scene {
	
	private double width = 0;
	private double height = 0;
	
	public AssetsManager assetsManager = null;
	public Controller controller = null;

	public Port(double width, double height, AssetsManager assetsManager, Controller controller) {
		super(new StartMenu(assetsManager, controller), width, height, Color.BLACK);
		
		this.width = width;
		this.height = height;
		
		this.assetsManager = assetsManager; 
		this.controller = controller;
		
		controller.contexts = new HashMap<String, Parent>(); //Pairs each context with a string key to find them on request
		setContexts();
	}
	
	//Creates an instance of every context used in the app
	public void setContexts() {
		controller.contexts.put("Start Menu", getRoot());
		controller.contexts.put("Pause Menu", new PauseMenu(assetsManager, controller));
		controller.contexts.put("Plot Four", new PlotFour(width, height, assetsManager, controller));
	}
}