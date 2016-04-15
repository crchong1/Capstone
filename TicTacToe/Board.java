import javax.swing.JFrame;
import  java.awt.BorderLayout;


/**
 * class Board which creates a window
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class Board extends JFrame
{
    private ButtonPanel buttonPanel;
    
    private int WINDOW_HEIGHT = 800;
    private int WINDOW_LENGTH = 600;
    
    public Board()
    {    
        this.setTitle("Tic Tac Toe");
        ButtonPanel controls = new ButtonPanel(canvas);

        this.setLayout(new BorderLayout());
        this.add(controls, (BorderLayout.SOUTH));
        this.add(canvas, BorderLayout.CENTER);
        
        this.setSize(WINDOW_LENGTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }
    

}
