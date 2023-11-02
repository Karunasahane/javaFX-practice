import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class p4 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage)throws Exception{
        ToggleGroup t=new ToggleGroup();
        RadioButton b1=new RadioButton("java");
        RadioButton b2=new RadioButton("cpp");
        RadioButton b3=new RadioButton("python");
        RadioButton b4=new RadioButton("R");
        b1.setToggleGroup(t);
        b2.setToggleGroup(t);
        b3.setToggleGroup(t);
        b4.setToggleGroup(t);

        VBox h=new VBox();
        h.getChildren().addAll(b1,b2,b3,b4);
        Scene s=new Scene(h);
        primaryStage.setScene(s);
        primaryStage.setTitle("javapro");
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);
        primaryStage.show();

    }
}
