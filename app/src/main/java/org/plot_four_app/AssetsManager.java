package org.plot_four_app;

import javafx.scene.media.Media;
import javafx.scene.text.Font; 

import java.io.File;

public class AssetsManager {
	
	public Font getFont(double size) {
		return Font.loadFont(
            new File(
                new File("").getAbsolutePath() + 
                "/src/main/resources/fonts/PressStart2P-Regular.ttf").toURI().toString(),
                size);
	}

	public Media getDropAudio() {
		return new Media(
			new File(
				new File("").getAbsolutePath() + 
				"/src/main/resources/audio/drop_sound.m4a").toURI().toString());
	}
}