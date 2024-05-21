package de.buw.se;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class ProductPage extends Application{

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPrefSize(640.0, 400.0);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setPrefSize(639.0, 400.0);

        AnchorPane leftPane = new AnchorPane();
        leftPane.setPrefSize(207.0, 400.0);
        leftPane.setStyle("-fx-background-color: #62CBF2;");

        Label welcomeLabel = new Label("Welcome, ");
        welcomeLabel.setLayoutX(24.0);
        welcomeLabel.setLayoutY(72.0);
        welcomeLabel.setPrefSize(79.0, 36.0);
        welcomeLabel.setFont(new Font(16.0));

        Label storeLabel = new Label(" Electronic Gadget Store");
        storeLabel.setLayoutX(6.0);
        storeLabel.setLayoutY(7.0);
        storeLabel.setPrefSize(194.0, 52.0);
        storeLabel.setStyle("-fx-background-color: #0F1110;");
        storeLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        storeLabel.setTextFill(javafx.scene.paint.Color.WHITE);
        storeLabel.setFont(new Font(18.0));

        Button mobilesButton = new Button("Mobiles");
        mobilesButton.setLayoutX(13.0);
        mobilesButton.setLayoutY(108.0);
        mobilesButton.setPrefSize(162.0, 26.0);

        Button signOutButton = new Button("Sign Out");
        signOutButton.setLayoutX(24.0);
        signOutButton.setLayoutY(337.0);
        
        signOutButton.setOnAction(event -> {displayHomePage(primaryStage);});

        Button laptopsButton = new Button("Laptops");
        laptopsButton.setLayoutX(13.0);
        laptopsButton.setLayoutY(146.0);
        laptopsButton.setPrefSize(162.0, 26.0);

        Button appleProductsButton = new Button("Apple Products");
        appleProductsButton.setLayoutX(13.0);
        appleProductsButton.setLayoutY(188.0);
        appleProductsButton.setPrefSize(162.0, 26.0);

        Button electronicsButton = new Button("TV, Appliances, Electronics");
        electronicsButton.setLayoutX(13.0);
        electronicsButton.setLayoutY(227.0);
        electronicsButton.setPrefSize(162.0, 26.0);

        Button sellProductButton = new Button("Sell your product");
        sellProductButton.setLayoutX(13.0);
        sellProductButton.setLayoutY(266.0);
        sellProductButton.setPrefSize(162.0, 26.0);
        sellProductButton.setOnAction(event -> {displaySellingPage(primaryStage);});

        Text userText = new Text("User");
        userText.setLayoutX(103.0);
        userText.setLayoutY(96.0);
        userText.setFont(new Font(16.0));

        leftPane.getChildren().addAll(welcomeLabel, storeLabel, mobilesButton, signOutButton, laptopsButton, appleProductsButton, electronicsButton, sellProductButton, userText);

        AnchorPane rightPane = new AnchorPane();
        rightPane.setLayoutX(207.0);
        rightPane.setPrefSize(434.0, 417.0);
        rightPane.setStyle("-fx-background-color: #D0D0D0;");

        TableView tableView1 = new TableView();
        tableView1.setLayoutX(40.0);
        tableView1.setLayoutY(83.0);
        tableView1.setPrefSize(151.0, 119.0);

        TableColumn column1_1 = new TableColumn("C1");
        column1_1.setPrefWidth(75.0);

        TableColumn column2_1 = new TableColumn("C2");
        column2_1.setPrefWidth(75.0);

        tableView1.getColumns().addAll(column1_1, column2_1);

        TableView tableView2 = new TableView();
        tableView2.setLayoutX(223.0);
        tableView2.setLayoutY(83.0);
        tableView2.setPrefSize(151.0, 119.0);

        TableColumn column1_2 = new TableColumn("C1");
        column1_2.setPrefWidth(75.0);

        TableColumn column2_2 = new TableColumn("C2");
        column2_2.setPrefWidth(75.0);

        tableView2.getColumns().addAll(column1_2, column2_2);

        TableView tableView3 = new TableView();
        tableView3.setLayoutX(40.0);
        tableView3.setLayoutY(218.0);
        tableView3.setPrefSize(151.0, 119.0);

        TableColumn column1_3 = new TableColumn("C1");
        column1_3.setPrefWidth(75.0);

        TableColumn column2_3 = new TableColumn("C2");
        column2_3.setPrefWidth(75.0);

        tableView3.getColumns().addAll(column1_3, column2_3);

        TableView tableView4 = new TableView();
        tableView4.setLayoutX(223.0);
        tableView4.setLayoutY(218.0);
        tableView4.setPrefSize(151.0, 119.0);

        TableColumn column1_4 = new TableColumn("C1");
        column1_4.setPrefWidth(75.0);

        TableColumn column2_4 = new TableColumn("C2");
        column2_4.setPrefWidth(75.0);

        tableView4.getColumns().addAll(column1_4, column2_4);

        rightPane.getChildren().addAll(tableView1, tableView2, tableView3, tableView4);

        anchorPane.getChildren().addAll(leftPane, rightPane);
        root.getChildren().add(anchorPane);

        primaryStage.setScene(new Scene(root, 640, 400));
        primaryStage.setTitle("Main Window");
        primaryStage.show();
    }
	

	


	private void displaySellingPage(Stage primaryStage) {
		
		SellingPage sellingPage = new SellingPage();
		sellingPage.start(primaryStage);
		//primaryStage.close();
		
	}





	private void displayHomePage(Stage primaryStage) {
		
		HomePage homepage = new HomePage();
		homepage.start(new Stage());
		primaryStage.close();
		
	}
	
	
}