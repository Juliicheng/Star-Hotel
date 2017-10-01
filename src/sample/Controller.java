package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button okButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.okButton.setOnAction(
                event -> System.out.println("Touch OK") // Lambda
        /* old version
        new EventHandler<>() {
            btn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
    public void handle(ActionEvent event) {
        System.out.println("Touch OK");
    }
}*/
        );
    }

}
