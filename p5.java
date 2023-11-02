import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class p5 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage)throws Exception{
        Button btn=new Button("click me");

        Label lb=new Label("hehe");
        lb.setText("enter your details for further process and node it is impoetant");
        lb.setWrapText(true);
        lb.setFont(new Font("Times New Roman", 32));

        TextField name=new TextField();
        name.setMaxWidth(400);
        name.setMaxHeight(100);
        PasswordField pass=new PasswordField();
        pass.setMaxHeight(100);
        pass.setMaxWidth(400);

         Hyperlink hp=new Hyperlink("https://www.google.com");

        CheckBox b1=new CheckBox("java");
        CheckBox b2=new CheckBox("cpp");
        CheckBox b3=new CheckBox("R");

        ToggleGroup t=new ToggleGroup();
        RadioButton bt1=new RadioButton("java");
        RadioButton bt2=new RadioButton("cpp");
        RadioButton bt3=new RadioButton("python");
        RadioButton bt4=new RadioButton("R");
        bt1.setToggleGroup(t);
        bt2.setToggleGroup(t);
        bt3.setToggleGroup(t);
        bt4.setToggleGroup(t);

        ComboBox sub=new ComboBox<>();
        sub.getItems().add("math");
        sub.getItems().add("bio");
        sub.getItems().add("chem");

        ListView l=new ListView<>();
        l.getItems().add("math");
        l.getItems().add("bio");
        l.getItems().add("chem");


        VBox h=new VBox();
        h.getChildren().addAll(btn,lb,name,pass,bt1,bt2,bt3,bt4,b1,b2,b3,hp,sub,l);
    
        Scene s=new Scene(h);
        
        primaryStage.setScene(s);
        primaryStage.setTitle("javapro");
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);
        primaryStage.show();


    }
}
