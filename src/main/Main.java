package main;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 
 */
/**
 * 
 */
public class Main extends Application {
	
	BorderPane bp = new BorderPane();
	FlowPane fp = new FlowPane();
	GridPane form = new GridPane();
	Scene scene = new Scene(bp, 1500, 800);
	VBox vb = new VBox();
	
	
	public void init() {
		
		form.setAlignment(Pos.CENTER);
		form.setHgap(10);
		form.setVgap(10);
		form.setPadding(new Insets(25, 25, 25, 25));
		
		Label signInLabel = new Label("Sign In");
		form.add(signInLabel, 0, 0);
		signInLabel.setStyle("-fx-font-size: 30px; -fx-font-weight: bold; -fx-text-fill: #053445;"); 
		form.setHalignment(signInLabel, javafx.geometry.HPos.CENTER);
		
		
		
		Label emailLabel = new Label("Email");
		emailLabel.setStyle("-fx-text-fill: #686868;");
		TextField emailField = new TextField();
		form.add(emailLabel, 0, 1);
		form.add(emailField, 0, 2);
		emailField.setPrefWidth(300);
		emailField.setPrefHeight(50);
		form.setHalignment(emailField, javafx.geometry.HPos.CENTER);
		
		Label passwordLabel = new Label("Password");
		passwordLabel.setStyle("-fx-text-fill: #686868;");
		PasswordField passwordField = new PasswordField();
		form.add(passwordLabel, 0, 3);
		form.add(passwordField, 0, 4);
		passwordField.setPrefWidth(300);
		passwordField.setPrefHeight(50);
		form.setHalignment(passwordField, javafx.geometry.HPos.CENTER);
	
		
		Label forgotPassword = new Label("Forgot Password?");
		forgotPassword.setStyle("-fx-font-size: 10px;");
		form.add(forgotPassword, 0, 5);
		form.setHalignment(forgotPassword, javafx.geometry.HPos.RIGHT);
		form.setValignment(forgotPassword, javafx.geometry.VPos.CENTER);
		
		Label dontHaveanAccount = new Label("Dont Have an Account?");
		dontHaveanAccount.setStyle("-fx-font-size: 10px;");
		form.add(dontHaveanAccount, 0, 10);
		form.setHalignment(dontHaveanAccount, javafx.geometry.HPos.CENTER);
		
		
		Button signInButton = new Button("Sign In");
		signInButton.setStyle("-fx-background-color: #053445; -fx-text-fill: white; -fx-font-size: 20px; -fx-background-radius: 20px;");
		form.add(signInButton, 0,8);
		signInButton.setPrefSize(200, 50);
		form.setHalignment(signInButton, javafx.geometry.HPos.CENTER);
		
		Rectangle backgroundBox = new Rectangle(400, 400);
        backgroundBox.setArcWidth(20);
        backgroundBox.setArcHeight(20);
        backgroundBox.setFill(Color.web("#FFFFFF")); 
        backgroundBox.setStroke(Color.web("#053445"));
        backgroundBox.setStrokeWidth(2);
        form.add(backgroundBox, 0, 3);

    
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(backgroundBox, form);
        stackPane.setAlignment(Pos.CENTER); 
        stackPane.setPadding(new Insets(125, 0, 0, 0));
        
        
        Image signInBackground = new javafx.scene.image.Image("file:///C:/Users/RYAN/eclipse-workspace/KostNelly/Image/KostNellyBackgroundWithLogo2.png");
        BackgroundImage background = new BackgroundImage(signInBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT ,BackgroundPosition.CENTER, 
        		new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));

       
        
        bp.setBackground(new Background(background));
        bp.setCenter(stackPane);
        
     
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.show();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Kost Nelly");
		
		Image icon = new Image("file:///C:/Users/RYAN/eclipse-workspace/KostNelly/Image/IconKostNelly.png");
		primaryStage.getIcons().add(icon);
		
	}

}
