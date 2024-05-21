package de.buw.se;

import java.awt.Button;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class SellingPage extends Application{
	
	 @Override
	    public void start(Stage primaryStage) {
	        VBox root = new VBox();
	        root.setPrefSize(640.0, 400.0);

	        AnchorPane anchorPane = new AnchorPane();
	        VBox.setVgrow(anchorPane, javafx.scene.layout.Priority.ALWAYS);

	        Label itemNameLabel = new Label("Item Name :-");
	        itemNameLabel.setLayoutX(42.0);
	        itemNameLabel.setLayoutY(73.0);
	        itemNameLabel.setStyle("-fx-background-color: #A99D9D;");
	        itemNameLabel.setFont(new Font(20.0));

	        Label yearOfPurchaseLabel = new Label("Year of Purchase :-");
	        yearOfPurchaseLabel.setLayoutX(42.0);
	        yearOfPurchaseLabel.setLayoutY(120.0);
	        yearOfPurchaseLabel.setStyle("-fx-background-color: #A99D9D;");
	        yearOfPurchaseLabel.setFont(new Font(20.0));

	        Label actualPriceLabel = new Label("Actual Price :-");
	        actualPriceLabel.setLayoutX(42.0);
	        actualPriceLabel.setLayoutY(169.0);
	        actualPriceLabel.setStyle("-fx-background-color: #A99D9D;");
	        actualPriceLabel.setFont(new Font(20.0));

	        Label sellingPriceLabel = new Label("Selling Price :-");
	        sellingPriceLabel.setLayoutX(40.0);
	        sellingPriceLabel.setLayoutY(225.0);
	        sellingPriceLabel.setStyle("-fx-background-color: #A99D9D;");
	        sellingPriceLabel.setFont(new Font(20.0));

	        Label imagesLabel = new Label("Images :-");
	        imagesLabel.setLayoutX(42.0);
	        imagesLabel.setLayoutY(275.0);
	        imagesLabel.setStyle("-fx-background-color: #A99D9D;");
	        imagesLabel.setFont(new Font(20.0));

	        TextField itemNameField = new TextField();
	        itemNameField.setLayoutX(276.0);
	        itemNameField.setLayoutY(73.0);
	        itemNameField.setPrefSize(246.0, 30.0);

	        TextField yearOfPurchaseField = new TextField();
	        yearOfPurchaseField.setLayoutX(276.0);
	        yearOfPurchaseField.setLayoutY(120.0);
	        yearOfPurchaseField.setPrefSize(246.0, 30.0);

	        TextField actualPriceField = new TextField();
	        actualPriceField.setLayoutX(276.0);
	        actualPriceField.setLayoutY(169.0);
	        actualPriceField.setPrefSize(246.0, 30.0);

	        TextField sellingPriceField = new TextField();
	        sellingPriceField.setLayoutX(276.0);
	        sellingPriceField.setLayoutY(225.0);
	        sellingPriceField.setPrefSize(246.0, 30.0);

	        Label commentsLabel = new Label("Comments :-");
	        commentsLabel.setLayoutX(40.0);
	        commentsLabel.setLayoutY(321.0);
	        commentsLabel.setStyle("-fx-background-color: #A99D9D;");
	        commentsLabel.setFont(new Font(20.0));

	        TextArea commentsArea = new TextArea();
	        commentsArea.setLayoutX(188.0);
	        commentsArea.setLayoutY(319.0);
	        commentsArea.setPrefSize(435.0, 63.0);

	        TextField sellingPrice1Field = new TextField();
	        sellingPrice1Field.setLayoutX(276.0);
	        sellingPrice1Field.setLayoutY(275.0);
	        sellingPrice1Field.setPrefSize(246.0, 30.0);

	        Label titleLabel = new Label("Selling Item Details");
	        titleLabel.setLayoutX(214.0);
	        titleLabel.setLayoutY(14.0);
	        titleLabel.setFont(new Font(25.0));

	       
	        anchorPane.getChildren().addAll(itemNameLabel, yearOfPurchaseLabel, actualPriceLabel, sellingPriceLabel, imagesLabel,
	                itemNameField, yearOfPurchaseField, actualPriceField, sellingPriceField, commentsLabel, commentsArea,
	                sellingPrice1Field, titleLabel);

	        root.getChildren().add(anchorPane);

	        primaryStage.setScene(new Scene(root, 640, 400));
	        primaryStage.setTitle("Selling Item Details");
	        primaryStage.show();
	        
	        //for getting the product page back
	        if(true) {
	        	displayProductPage(new Stage());
	        }
	    }
	

private void displayProductPage(Stage primaryStage) {
	
	ProductPage homepage = new ProductPage();
	homepage.start(new Stage());
	primaryStage.close();
	
}
	 
}
