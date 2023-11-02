import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class p6 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage)throws Exception{
        MenuBar mb=new MenuBar();

        //menubar mdhle konte konte menu rahtil
        Menu file=new Menu("file");
        Menu edit=new Menu("edit");
        Menu tools=new Menu("tools");
        Menu view=new Menu("view");
        Menu go=new Menu("go");
        
        //menu mdhle items
        MenuItem New=new MenuItem("new");
        MenuItem save=new MenuItem("save");
        MenuItem saveAs=new MenuItem("saveAs");
        MenuItem exit=new MenuItem("exit");
        file.getItems().addAll(New,save,saveAs,exit);

        MenuItem undo=new MenuItem("undo");
        MenuItem redo=new MenuItem("redo");
        MenuItem cut=new MenuItem("cut");
        MenuItem copy=new MenuItem("copy");
        MenuItem paste=new MenuItem("paste");
        edit.getItems().addAll(undo,redo,cut,copy,paste);

        Menu run=new Menu("run");  //karan apn run mdhe items taknare tr to menu jhala
        MenuItem debug=new MenuItem("debug");
        MenuItem search=new MenuItem("search");
        MenuItem back=new MenuItem("back");
        tools.getItems().addAll(search,run,debug,back);

        MenuItem start_debug=new MenuItem("start_debug");
        MenuItem without_debug=new MenuItem("without_debug");
        MenuItem close=new MenuItem("back");
        run.getItems().addAll(start_debug,without_debug,close);

        mb.getMenus().addAll(file,edit,tools,view,go);

        BorderPane b=new BorderPane(); 
        b.setTop(mb);

        Scene s=new Scene(b);
        primaryStage.setScene(s);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
    
}
