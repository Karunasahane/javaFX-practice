import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class p1 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage)throws Exception{
        Button btn=new Button("click me");
        HBox h=new HBox();
        h.getChildren().add(btn);
        Scene s=new Scene(h);
        primaryStage.setScene(s);
        primaryStage.setTitle("javapro");
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);
        primaryStage.show();

    }
}
