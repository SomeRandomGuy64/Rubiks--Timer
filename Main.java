import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	//Allows model, view, and controller objects to be created
	View view;
    Model model;
    Controller controller;

	public static void main(String[] args) {
		launch(args);
		
	}

	@Override
	public void start(Stage stage) throws Exception {
		//sets the title of the window to "Rubik's Timer"
		stage.setTitle("Rubik's Timer");
		//instantiates a pane object called root 
		Pane root = new Pane();
		//Sets the window size to 1280x720
		stage.setScene(new Scene(root, 1280, 720));
        model = new Model();
        view = new View(model, root);
        controller = new Controller(model, view);
		stage.show();
	}
}