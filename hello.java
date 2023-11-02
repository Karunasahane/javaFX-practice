import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class hello extends Application{
    
    @Override
    public void start(Stage primaryStage){
        Button btn = new Button();
        btn.setText("Say 'Hello'");
        btn.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
                System.out.println("Hello");
            }
        }); 

        StackPane c2w_root = new StackPane();
        c2w_root.getChildren().add(btn);

        Scene c2w_Scene = new Scene(c2w_root, 300,200);
        primaryStage.setTitle("Hello");
        primaryStage.setScene(c2w_Scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}