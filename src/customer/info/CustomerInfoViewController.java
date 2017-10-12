package customer.info;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerInfoViewController implements Initializable {

    @FXML
    private TextField addressTextField;

    @FXML
    private RadioButton defaulterButton;

    @FXML
    private TextField contactNumTextField;

    @FXML
    private RadioButton frequenterButton;

    @FXML
    private TextField postalCodeTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private ChoiceBox<?> stateChoiceBox;

    @FXML
    private Button confirmButton;

    @FXML
    private TextField surnameTextField;

    @FXML
    private TextField surburbTextField;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private Button cancelButton;


//    @Override
//    public void getStateChoiceBox

    public ChoiceBox<?> getStateChoiceBox() {
//        ChoiceBox stateChoiceBox = new ChoiceBox();
//        stateChoiceBox.getItems().addAll("dd", "dc");


//        ChoiceBox stateChoiceBox = new ChoiceBox();
//        stateChoiceBox.getItems().addAll("item1", "item2", "item3");


        return stateChoiceBox;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

//        stateChoiceBox = new ChoiceBox();
//        stateChoiceBox.getItems().addAll("dd", "dc");
//
//                ChoiceBox stateChoiceBox = new ChoiceBox();
//        stateChoiceBox.getItems().addAll("item1", "item2", "item3");


        this.confirmButton.setOnAction(

//                event -> System.out.println("Touch confirm") // Lambda
                event -> {
                    firstNameTextField.getText();
                    surnameTextField.getText();

                    System.out.println(postalCodeTextField.getText());
                    System.out.println("Touch confirm");
                }

        );

        ToggleGroup group = new ToggleGroup();
//        RadioButton button1 = new RadioButton("select first");
        maleRadioButton.setToggleGroup(group);
        femaleRadioButton.setToggleGroup(group);
//        maleRadioButton.setSelected(true);

        postalCodeTextField.setText("2007");
        // postalCodeTextField.getText()
        //stateChoiceBox = new ChoiceBox(FXCollections.observableArrayList("A", "B", "C"));
//        stateChoiceBox.setItems(FXCollections.observableArrayList(
//                "A", "B", new Separator(), "C", "D");
        //)
    }

}
