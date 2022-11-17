package application;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("/DnDMain.fxml"));
		primaryStage.setTitle("DnD Monster Roller");
		primaryStage.setScene(new Scene(root, 600, 645));
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


//https://api.open5e.com/monsters/?limit= + "count"



