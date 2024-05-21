package de.buw.se;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HomePage extends Application{
	
	public void start(Stage primaryStage)
	{

		 
		primaryStage.setTitle("Home Page");
		VBox root = new VBox();
		root.setPrefSize(640.0, 400.0);

		AnchorPane anchorPane = new AnchorPane();
		anchorPane.setPrefSize(640.0, 400.0);
		VBox.setVgrow(anchorPane, javafx.scene.layout.Priority.ALWAYS);

		AnchorPane sideForm = new AnchorPane();
		sideForm.setLayoutY(-6.0);
		sideForm.setPrefSize(298.0, 411.0);
		sideForm.setStyle("-fx-background-color: #606060;");

		Label createAccountLabel = new Label("Create Account");
		createAccountLabel.setLayoutX(94.0);
		createAccountLabel.setLayoutY(296.0);
		createAccountLabel.setTextFill(javafx.scene.paint.Color.WHITE);
		createAccountLabel.setFont(new Font(20.0));

		Button createNewAccountButton = new Button("Create New Account");
		createNewAccountButton.setLayoutX(62.0);
		createNewAccountButton.setLayoutY(339.0);
		createNewAccountButton.setMnemonicParsing(false);
		createNewAccountButton.setPrefSize(199.0, 30.0);
		
		
		createNewAccountButton.setOnAction(event -> {displayUserForm(primaryStage);} );
		
	

		Label welcomeLabel1 = new Label("Welcome to ");
		welcomeLabel1.setLayoutX(51.0);
		welcomeLabel1.setLayoutY(98.0);
		welcomeLabel1.setTextFill(javafx.scene.paint.Color.WHITE);
		welcomeLabel1.setFont(new Font(13.0));

		Label welcomeLabel2 = new Label("Electronic Gadget Store");
		welcomeLabel2.setLayoutX(50.0);
		welcomeLabel2.setLayoutY(115.0);
		welcomeLabel2.setTextFill(javafx.scene.paint.Color.WHITE);
		welcomeLabel2.setFont(new Font(18.0));

		sideForm.getChildren().addAll(createAccountLabel, createNewAccountButton, welcomeLabel1, welcomeLabel2);

		AnchorPane i_loginForm = new AnchorPane();
		i_loginForm.setLayoutX(320.0);
		i_loginForm.setLayoutY(-2.0);
		i_loginForm.setPrefSize(300.0, 400.0);

		Label loginLabel = new Label("Login Account");
		loginLabel.setLayoutX(45.0);
		loginLabel.setLayoutY(128.0);
		loginLabel.setStyle("head-label");
		loginLabel.setTextFill(javafx.scene.paint.Color.valueOf("#2653d9"));
		loginLabel.setFont(new Font(20.0));

		TextField usernameField = new TextField();
		usernameField.setLayoutX(45.0);
		usernameField.setLayoutY(169.0);
		usernameField.setPrefSize(220.0, 30.0);
		usernameField.setPromptText("Username");

		PasswordField passwordField = new PasswordField();
		passwordField.setLayoutX(45.0);
		passwordField.setLayoutY(222.0);
		passwordField.setPrefSize(220.0, 30.0);
		passwordField.setPromptText("Password");

		Button loginButton = new Button("Login");
		loginButton.setLayoutX(45.0);
		loginButton.setLayoutY(319.0);
		loginButton.setMnemonicParsing(false);
		loginButton.setPrefSize(220.0, 30.0);
		
		loginButton.setOnAction(event -> {
			// Retrieve email and password
			String email = usernameField.getText();
			String password = passwordField.getText();

			// Call method to validate user
			boolean isValidUser = ReadFromExcel.validateUser(email, password);
			
			// Show message based on validation result
			if (isValidUser) {
				
				
				Alert alert;
				alert = new Alert(AlertType.CONFIRMATION);
				
	            alert.setTitle("Login Succesful");
				System.out.println("Login successful!");
				alert.showAndWait();
				displayProductForm(primaryStage);
				HomePage.setVisible(false);
				// Open the product display window
				// openProductDisplay(primaryStage);
			} else {
				Alert alert;
				alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect Username/Password");
                alert.showAndWait();
                System.out.println("Invalid email or password. Please try again.");
				// window display that it is not correct
				// go back to homepage
			}
		});

		Hyperlink forgotPasswordLink = new Hyperlink("Forgot Password?");
		forgotPasswordLink.setLayoutX(45.0);
		forgotPasswordLink.setLayoutY(271.0);

		i_loginForm.getChildren().addAll(loginLabel, usernameField, passwordField, loginButton, forgotPasswordLink);

		anchorPane.getChildren().addAll(sideForm, i_loginForm);

		root.getChildren().add(anchorPane);
		
		

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private static void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void displayProductForm(Stage primaryStage) {
		// TODO Auto-generated method stub
		ProductPage productPage = new ProductPage();
		productPage.start(new Stage());
		primaryStage.close();
		
	}

	private void displayUserForm(Stage primaryStage) {
		// TODO Auto-generated method stub
		NewUserForm newUserForm = new NewUserForm();
		newUserForm.start(new Stage());
		
		
	        // Close the login window
	       // primaryStage.close();
	}

	

}