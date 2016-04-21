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
    private int gameSize = 9;
    private Color newColor;
    private JPanel buttonColor;
    private Board canvas;
    public ButtonPanel()
    {   
        JButton[] buttonArray = new JButton[gameSize];
        // https://docs.oracle.com/javase/tutorial/uiswing/components/button.html#abstractbutton
        for(int i = 0; i < buttonArray.length; i++)
        {
            buttonArray[i] = new JButton();
        }
        
        
        this.colorButton = new JButton("Pick Color");
        this.add(this.colorButton);
        
        newColor = canvas.getColor();
        
        this.circleButton = new JButton("Add Circle");
        this.add(this.circleButton);
        
        this.squareButton = new JButton("Add Square");
        this.add(this.squareButton);
        
        squareColor = new JPanel();
        newColor = canvas.getColor();
        squareColor.setBackground(newColor);
        squareColor.setPreferredSize(new Dimension(10, 10));
        this.add(squareColor);
        
        ClickListener listener = new ClickListener();
        this.colorButton.addActionListener(listener); 
        this.circleButton.addActionListener(listener); //you need this to register the listener
        this.squareButton.addActionListener(listener); 
        this.canvas = canvas;
    }
    

    public class ClickListener implements ActionListener
    {
    
        public void actionPerformed(ActionEvent event)
        {

            else if (event.getActionCommand().equals("Add Circle"))
            {
                canvas.addCircle();
            }
            else if (event.getActionCommand().equals("Add Square"))
            {
                canvas.addSquare();
            }
            else
            {
            }
            canvas.repaint();
            
        }
    }

}
