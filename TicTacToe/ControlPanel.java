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
 * class ControlPanel which creates a window
 * 
 * @Connor Chong 
 * @2/23/16
 */
public class ControlPanel extends JPanel
{
    private TicTacToe game;
    private JButton button00;
    private JButton button01;
    private JButton button02;
    private JButton button11;
    private JButton button12;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private Color newColor;
    private JPanel buttonColor;
    private DrawingPanel canvas;
    public ControlPanel(DrawingPanel canvas)
    {   

        // https://docs.oracle.com/javase/tutorial/uiswing/components/button.html#abstractbutton
        for(int i = 0; i < )
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
