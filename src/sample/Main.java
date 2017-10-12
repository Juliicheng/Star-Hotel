package sample;

import javafx.application.Application;
import javafx.scene.Scene;
// import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

//        System.out.println("Test...\nType anything:");
//        Scanner scanner = new Scanner(System.in);
//        String testString = scanner.next();
//        System.out.println(testString);
//

        Parent root = FXMLLoader.load(getClass().getResource("/customer/info/CustomerInfoView.fxml"));

//        StackPane root = new StackPane();
//        root.getChildren().add(btn);

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("xxx");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}