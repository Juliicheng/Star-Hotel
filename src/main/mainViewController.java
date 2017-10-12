package main;

//import com.sun.javafx.stage.StageHelper;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Callback;

import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class mainViewController implements Initializable {


    @FXML
    private Button customerButton;
//    @FXML
//    private DatePicker startDatePicker;


//    // Factory to create Cell of DatePicker
//    private Callback<DatePicker, DateCell> getDayCellFactory() {
//
//        // dayCellFactory
//        return new Callback<>() {
//
//            @Override
//            public DateCell call(final DatePicker datePicker) {
//                return new DateCell() {
//                    @Override
//                    public void updateItem(LocalDate item, boolean empty) {
//                        super.updateItem(item, empty);
//
//                        // Disable Monday, Tueday, Wednesday.
//                        if (item.getDayOfWeek() == DayOfWeek.MONDAY //
//                                || item.getDayOfWeek() == DayOfWeek.TUESDAY //
//                                || item.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
//                            setDisable(true);
//                            setStyle("-fx-background-color: #ffc0cb;");
//                        }
//                    }
//                };
//            }
//        };
//        //return dayCellFactory;
//    }

//    private disableDays(DatePicker dp) {
//
//    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.customerButton.setOnAction(
                event -> {

                    ObservableList<Window> windows = Window.getWindows();
                    Stage stage = (Stage) windows.get(0);
                    Parent root;
                    try {
                        root = FXMLLoader.load(getClass().getResource("/customer/list/CustomerListView.fxml"));
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                    } catch (Exception nn) {

                    }


//                    System.out.println("Touch OK"); // Lambda
                }



        /* old version
        new EventHandler<>() {
            btn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
    public void handle(ActionEvent event) {
        System.out.println("Touch OK");
    }
}*/
        );

//        startDatePicker.setShowWeekNumbers(true);
//
//        // Factory to create Cell of DatePicker
//        Callback<DatePicker, DateCell> dayCellFactory = this.getDayCellFactory();
//        startDatePicker.setDayCellFactory(dayCellFactory);

    }

}

// Change Stage
/*
 * ObservableList<Stage> stage = FXRobotHelper.getStages();
 * Scene scene = new Scene(FXMLLoader.load(getClass().getResource("FXML.fxml")));
 * stage.get(0).setScene(scene);
 */
/*
* 	public PrintController(String code, Stage primaryStage) {
		this.code = code;
		this.primaryStage = primaryStage;
		scene = new Scene(createContent3());
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		 scene.getStylesheets().add(getClass().getResource("application_print.css").toExternalForm());
		primaryStage.setTitle("提货宝");
		primaryStage.setFullScreen(true); // 全屏显示

		primaryStage.setScene(scene);
		primaryStage.show();
	}
*/