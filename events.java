import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class events extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primarStage){
        TextField t=new TextField();
        Button bt=new Button("ok");
        Label lb=new Label();

        bt.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                lb.setText("hello "+t.getText());
            }
        });

        CheckBox ch=new CheckBox("pune");
        CheckBox ch2=new CheckBox("goa");
        Button bt2=new Button("submit");
        Label lb2=new Label();

        bt2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                String s="";
                if(ch.isSelected()){
                    s=s+" "+ch.getText();
                }
                if(ch2.isSelected()){
                    s=s+" "+ch2.getText();
                }
                if(s==""){
                    lb2.setText("please select option");
                }
                else{
                    lb2.setText("you have selected "+s+" as a destination");
                }
                

                  
            }
        });
        
        ToggleGroup tb=new ToggleGroup();
        RadioButton a=new RadioButton("a");
        RadioButton b=new RadioButton("b");
        RadioButton c=new RadioButton("c");
        a.setToggleGroup(tb);
        b.setToggleGroup(tb);
        c.setToggleGroup(tb);
        Button bt3=new Button("submit");
        Label lb3=new Label();

        bt3.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                if(a.isSelected()){
                 lb3.setText("your option is "+a.getText());
                 lb3.setFont(new Font(12));
                }
                else if(b.isSelected()){
                 lb3.setText("your option is "+b.getText());
                 lb3.setFont(new Font(12));
                }
                else if(c.isSelected()){
                 lb3.setText("your option is "+c.getText());
                 lb3.setFont(new Font(12));
                }
                else{
                 lb3.setText("please select one of the above option");
                 lb3.setTextFill(Color.RED);
                 lb3.setFont(new Font("Times new Roman",24));
                }
            }
        });

        


        
        VBox v=new VBox();
        v.getChildren().addAll(t,bt,lb,ch,ch2,bt2,lb2,a,b,c,bt3,lb3);
        Scene s=new Scene(v);
        primarStage.setScene(s);
        primarStage.setWidth(500);
        primarStage.setHeight(300);
        primarStage.show();

    }
    
}
