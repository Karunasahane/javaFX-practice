import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
public class p3 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage)throws Exception{
        Label lb=new Label("hehe");
        lb.setText("enter your details for further process and node it is impoetant");
        lb.setWrapText(true);
        lb.setFont(new Font("Times New Roman", 32));
        lb.setTextFill(Color.RED);
        
        HBox h=new HBox();
        h.getChildren().add(lb);
        Scene s=new Scene(h);
        primaryStage.setScene(s);
        primaryStage.setTitle("javapro");
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);
        primaryStage.show();

    }
}
