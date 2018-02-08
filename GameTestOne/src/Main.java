import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application{
    public void start(Stage mainStage) throws Exception {
        Pane paneOne = new Pane();
        Pane paneTwo = new Pane();
        Scene mainMenu = new Scene(paneOne, 1080, 720, Color.BLACK);
        Scene secondMenu = new Scene(paneTwo, 1920, 1080, Color.BLUE);
        mainStage.setTitle("Example Stage");
        mainStage.setScene(mainMenu);
        mainStage.show();
        Button b = new Button("Play Game");
        paneOne.getChildren().add(b);
        b.setOnMouseClicked(e->{
            System.out.println("xd");
            mainStage.setScene(secondMenu);
            if(mainStage.getScene() == secondMenu)
            {
                Rectangle r = new Rectangle(100, 200);
                Circle r1 = new Circle(10, Color.BLUE);
                r.setFill(Color.RED);
                paneTwo.getChildren().addAll(r, r1);
                r1.setCenterX(1000);
                r1.setCenterY(500);
            }
        });
    }
    public static void main (String args[]){
            launch(args);
    }
}
