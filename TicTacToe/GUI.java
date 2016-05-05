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
public class GUI extends JPanel
{
    private TicTacToe game;
    private int gameSize = 3;
    private JPanel buttonColor;
    private Board canvas;
    public GUI(Game canvas, int[][] gameArray)
    {
        JButton[][] buttonArray = new JButton[gameSize][gameSize];
        for(int i = 0; i < buttonArray.length; i++)
        {
            for(int j = 0; j < buttonArray[].length; j++)
            {
                buttonArray[i][j] = new JButton("X: " + i + " Y: " + j);
                buttonArray[i][j].setPreferredSize(new Dimension(50, 50));
                this.add(buttonArray[i][j]);
            }
        }
        
        ClickListener listener = new ClickListener();
        for(int i = 0; i < buttonArray.length; i++)
        {
            for(int j = 0; j < buttonArray[].length; j++)
            {
                buttonArray[i][j].addActionListener(listener);
                buttonArray[i][j].setText("");
            }
        }
        this.canvas = canvas;
    }
    

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            for(int i = 0; i < buttonArray.length; i++)
            {
                for(int j = 0; j < buttonArray[].length; j++)
                {
                    if(event.getActionCommand().equals(buttonArray[i][j])
                    {
                        if(TicTacToe.getPlayer() == 1)
                        {
                            TicTacToe.setGameArray(i, j, 1);
                        }
                        else if (TicTacToe.getPlayer() == 2)
                        {
                            TicTacToe.setGameArray(i, j, 2);
                        }
                        else
                        {
                            
                        }
                    }
                }
            }
        }
    }
    
    public void updateGUI(int[][] gameArray)
    {
        for(int i = 0; i < buttonArray.length; i++)
        {
            for(int j = 0; j < buttonArray[].length; j++)
            {
                if (gameArray[i][j] == 1)
                {
                    buttonArray[i][j].setText("X");
                }
                else if (gameArray[i][j] == 2)
                {
                    buttonArray[i][j].setText("0");
                }
                else
                {
                    buttonArray[i][j].setText("");
                }
            }
        }
    }
}
