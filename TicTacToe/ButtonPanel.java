import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
/**
 * class ButtonPanel which creates a window
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class ButtonPanel extends JPanel
{
    private TicTacToe game;
    private int gameSize = 3;
    private Color newColor;
    private JPanel buttonColor;
    private Board canvas;
    public ButtonPanel(Game canvas, boolean[][] gameArray)
    {
        JButton[][] buttonArray = new JButton[gameSize][gameSize];
        for(int i = 0; i < buttonArray.length; i++)
        {
            for(int j = 0; j < buttonArray[].length; j++)
            {
                buttonArray[i][j] = new JButton("X: " + i + " Y: " + j);
                buttonArray[i][j].setPreferredSize(new Dimension(10, 10));
                this.add(buttonArray[i][j]);
            }
        }
        
        ClickListener listener = new ClickListener();
        for(int i = 0; i < buttonArray.length; i++)
        {
            for(int j = 0; j < buttonArray[].length; j++)
            {
                buttonArray[i][j].addActionListener(listener);
            }
        }
        this.canvas = canvas;
    }
    

    public class ClickListener implements ActionListener
    {
    
        public void actionPerformed(ActionEvent event)
        {
            for(int i = 0; i< gameSize; i++)
            {
                if(event.getActionCommand().equals(buttonArray[i]))
                {
                    TicTacToe.move(i);
                    canvas.repaint();
                }
            }
        }
    }

}
