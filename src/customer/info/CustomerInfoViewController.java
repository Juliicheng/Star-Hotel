package customer.info;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class CustomerInfoViewController {

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

    final private String[] states = {"NSW", "VIC", "ACT"};

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
    @FXML
    private ChoiceBox stateChoiceBox; // no <?> !!!!
//    private ArrayList<String> statesList;



//    @Override
//    public void getStateChoiceBox

    public ChoiceBox<?> getStateChoiceBox() {
//        ChoiceBox stateChoiceBox = new ChoiceBox();
//        stateChoiceBox.getItems().addAll("dd", "dc");


//        ChoiceBox stateChoiceBox = new ChoiceBox();
//        stateChoiceBox.getItems().addAll("item1", "item2", "item3");


        return stateChoiceBox;
    }

    @FXML
    public void initialize() {
//        statesList.
//       private ArrayList<String> states = Arrays.asList(states);
        stateChoiceBox.setItems(FXCollections.observableArrayList(Arrays.asList(states)));
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

//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//
//
//    }

}
