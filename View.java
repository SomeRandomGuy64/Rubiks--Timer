import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class View  {
    Model model;
	Pane root;
	Canvas canvas;
	GraphicsContext gc;
	
	
	//constructor
	public View(Model model, Pane root) {
		super();
		this.root = root;
        this.model = model;
        
        canvas = new Canvas(1280, 720);
        gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		root.getChildren().add(canvas);
    }
}