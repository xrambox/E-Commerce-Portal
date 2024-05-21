package de.buw.se;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NewUserForm extends Application{

	    @Override
	    public void start(Stage primaryStage) {
	        AnchorPane signUpForm = new AnchorPane();
	        signUpForm.setPrefSize(300.0, 400.0);

	        Label titleLabel = new Label("New User Registration");
	        titleLabel.setLayoutX(45.0);
	        titleLabel.setLayoutY(122.0);
	        titleLabel.setTextFill(javafx.scene.paint.Color.valueOf("#2653d9"));
	        titleLabel.setFont(new Font(20.0));

	        TextField usernameField = new TextField();
	        usernameField.setLayoutX(45.0);
	        usernameField.setLayoutY(163.0);
	        usernameField.setPrefSize(220.0, 30.0);
	        usernameField.setPromptText("Username");

	        PasswordField passwordField = new PasswordField();
	        passwordField.setLayoutX(45.0);
	        passwordField.setLayoutY(206.0);
	        passwordField.setPrefSize(220.0, 30.0);
	        passwordField.setPromptText("Password");

	        Button createButton = new Button("Create");
	        createButton.setLayoutX(45.0);
	        createButton.setLayoutY(315.0);
	        createButton.setMnemonicParsing(false);
	        createButton.setPrefSize(220.0, 30.0);

	        PasswordField reEnterPasswordField = new PasswordField();
	        reEnterPasswordField.setLayoutX(45.0);
	        reEnterPasswordField.setLayoutY(258.0);
	        reEnterPasswordField.setPrefSize(220.0, 30.0);
	        reEnterPasswordField.setPromptText("Re-Enter Password");
	        
	        //Add event handler for the create button
	        createButton.setOnAction(event -> {
	            String username = usernameField.getText();
	            String password = passwordField.getText();
	            // Validate password and re-enter password here if needed
	            
	            // Call method to insert user details into database
	           DataStoreSql.addUser(username, password);
	            
	            if( DataStoreSql.addUser(username, password) == true) {
	            	 Alert alert;
	 				alert = new Alert(AlertType.CONFIRMATION);
	 	            alert.setTitle("User created successfully!");
	 	            alert.showAndWait();
	 	            
	            }else {
	            	Alert alert;
	 				alert = new Alert(AlertType.ERROR);
	 	            alert.setTitle("INVALID USERNAME AND PASSWORD");
	 	            alert.showAndWait();
	            	
	            }
	        
	           
	            
	         
	            
	         // Close the dialogue box
	            Stage stage = (Stage) createButton.getScene().getWindow();
	            stage.close();});
	        

	        signUpForm.getChildren().addAll(titleLabel, usernameField, passwordField, createButton, reEnterPasswordField);

	        Scene scene = new Scene(signUpForm, 300, 400);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("New User Form");
	        primaryStage.show();
	    }
}