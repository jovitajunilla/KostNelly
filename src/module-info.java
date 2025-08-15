package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	Scene scene;


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HomePage hp = new HomePage();
		scene = hp.getHomePageScene();
		primaryStage.setTitle("Home");
		primaryStage.setScene(scene);
	//	Image icon = new Image("file:///C:/Users/Asus/eclipse-workspace/ProjectKost-BAD/imagesource/IconKostNelly%20-%20Login.png"); 
	//	primaryStage.getIcons().add(icon);
		primaryStage.show();
	}
}