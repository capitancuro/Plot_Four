package org.plot_four_app;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.image.Image;
import javafx.scene.text.Font; 


public class AssetsManager {
	public Image getImage() {
		return new Image(
			new File(
				new File("").getAbsolutePath() + 
				"/src/main/resources/Plot_Four.png").toURI().toString());
	}
	
	public Font getFont(double size) {
		return Font.loadFont(
            new File(
                new File("").getAbsolutePath() + 
                "/src/main/resources/PressStart2P-Regular.ttf").toURI().toString(),
                size);
	}

	public Media getDropAudio() {
		return new Media(
			new File(
				new File("").getAbsolutePath() + 
				"/src/main/resources/drop_sound.m4a").toURI().toString());
	}
}
