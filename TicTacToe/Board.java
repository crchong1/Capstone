import javax.swing.JFrame;
import  java.awt.BorderLayout;
import java.util.Scanner;

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
    private int playerNumber = 0;
    
    public Board()
    {    
        this.setTitle("Tic Tac Toe");
        ButtonPanel controls = new ButtonPanel();

        this.setLayout(new BorderLayout());
        this.add(controls, (BorderLayout.CENTER));
        
        this.setSize(WINDOW_LENGTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        Board game = new Board();
        
        Scanner scan = new Scanner(System.in);
        playerNumber = 
        
    }
    

}
