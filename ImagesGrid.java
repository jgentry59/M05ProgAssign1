import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImagesGrid extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Image Grid Pane");

        // Creates grid to hold the images
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Loads each file
        Image chinaImage = new Image("china.gif");
        Image caImage = new Image("ca.gif");
        Image usImage = new Image("us.gif");
        Image ukImage = new Image("uk.gif");

        // Creates ImageViews to show images
        ImageView chinaImageView = new ImageView(chinaImage);
        ImageView caImageView = new ImageView(caImage);
        ImageView usImageView = new ImageView(usImage);
        ImageView ukImageView = new ImageView(ukImage);

        // Add ImageViews to Grid
        gridPane.add(chinaImageView, 0, 0);
        gridPane.add(caImageView, 1, 0);
        gridPane.add(usImageView, 0, 1);
        gridPane.add(ukImageView, 1, 1);

        // Creates scene and places on the stage
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
