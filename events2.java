import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class events2 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primarStage){
        TextField t=new TextField();
        Label lb=new Label();

        t.setOnMouseExited(new EventHandler<Event>() {
            public void handle(Event event){
                lb.setText("hello "+t.getText());
                lb.setTextFill(Color.BLACK);
            }
        });
        t.setOnMouseEntered(new EventHandler<Event>(){
            public void handle(Event event){
                if(t.getText()!=""){
                lb.setText("please enter your name!");
                lb.setTextFill(Color.RED);
                lb.setFont(new Font(10));
                }
            }
        });

        CheckBox ch=new CheckBox("pune");
        CheckBox ch2=new CheckBox("goa");
        Label lb2=new Label();
        Label lb3=new Label();

        ch2.setOnMouseClicked(new EventHandler<Event>() {
            public void handle(Event event){
                String s="";
                if(ch2.isSelected()){
                    s=s+" "+ch2.getText();
                     lb2.setText("you have selected "+s+" as a destination");
                }
                else{
                    lb2.setText("");
                }
            }
        });
        ch.setOnMouseClicked(new EventHandler<Event>() {
            public void handle(Event event){
                String s="";
                if(ch.isSelected()){
                    s=s+" "+ch.getText();
                    lb3.setText("you have selected "+s+" as a destination");
                }
                else{
                    lb3.setText("");
                }
            }
        });
        

        
        VBox v=new VBox();
        v.getChildren().addAll(t,lb,ch,ch2,lb3,lb2);
        Scene s=new Scene(v);
        primarStage.setScene(s);
        primarStage.setWidth(500);
        primarStage.setHeight(300);
        primarStage.show();

    }
    
}

