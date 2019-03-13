package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	private Dizionario d = new Dizionario();
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	
    	String word = this.txtWord.getText().toLowerCase();
    	
    	if(word.contains(" ")) {
    		
    		String c[] = word.split(" ");
    		if(c.length == 2) {
    		if(c[0].matches("[a-zA-Z]+") && c[1].matches("[a-zA-Z]+")) {
    		d.addParola(c[0], c[1]);
    		this.txtResult.appendText("Parola aggiunta al dizionario!\n");
    		} else this.txtResult.appendText("Formato errato!\n");
    		} else this.txtResult.appendText("Formato errato!\n");
    	} else {
    		//if(word.matches("[a-zA-Z]+")) {
    			if(d.translate(word) != null)
    				txtResult.appendText(d.translate(word)+"\n");
    			else txtResult.appendText("Parola senza traduzione!\n");
    		//} else this.txtResult.appendText("Formato errato!\n");
    	}
    	this.txtWord.clear();
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    	txtResult.clear();
    	d.getParole().clear();
    }
    
}
