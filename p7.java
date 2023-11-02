import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class p7 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage){
        Label lb=new Label("enter birth date:");
        DatePicker dp=new DatePicker();

        VBox v=new VBox();
        v.getChildren().addAll(lb,dp);

        Scene s=new Scene(v);

        primaryStage.setScene(s);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
}
