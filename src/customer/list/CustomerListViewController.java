package customer.list;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerListViewController implements Initializable {

    @FXML
    private Button addButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addButton.setOnAction(
                (event -> System.out.println("to info"))
        );
    }
}
