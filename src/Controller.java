package Forest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import Forest.Grid;

public class Controller {
	
	@FXML private TextField field1;
	@FXML private TextField field2;
	@FXML private Button ButtonCalc;
	@FXML private GridPane stackGame;


	@FXML
	public void generateMatrix(ActionEvent event) throws Exception {
	    String value1_str = field1.getText();
	    String value2_str = field2.getText();
	    // parse() returns type int or Integer
	    try {
		    int value1 = Integer.parseInt(value1_str);
		    int value2 = Integer.parseInt(value2_str);
		    System.out.println("J'ai recu les valeurs : "+value1+" : "+value2);
		    Grid grid = new Grid(value1, value2);
		    
		    //At this point we should have everything ready to go to game state
		    //Let's load the scene and generate the cells
		    this.changeScene(event, "./Game.fxml");
		    Stage stage;
	        stage=(Stage) stackGame.getScene().getWindow();
	        
	        Label label = new Label("Address Book");
		    stackGame.add(label, 1, 1);
		    
		    stage.show();
		   
		    
		    


	    }
	    catch (Exception e){
	    	System.out.println(e);
	    	ButtonCalc.setText("Calculate (int only)");
	    }
	    
	    
	}
	
	public void changeScene(ActionEvent event, String fxml) throws Exception {
		//The goal of this method is to easily switch between scenes
		//ActionEvent == On Action in scene builder
		Parent parent = FXMLLoader.load(getClass().getResource(fxml));
	    Scene scene = new Scene(parent); 
	    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    
	    window.setScene(scene);
	    window.show();
	}
	
	
	public void addLabel(ActionEvent event) {
		Label label = new Label("Address Book");
	    stackGame.add(label, 1, 1);
	    Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
	    window.show();
	}

}
