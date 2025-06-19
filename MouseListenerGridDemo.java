import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
public class MouseListenerGridDemo extends JFrame implements MouseListener { 
JButton[][] buttons = new JButton[3][3];  
       public MouseListenerGridDemo() { 
        setTitle("MouseListener with GridLayout"); 
        setLayout(new GridLayout(3, 3));  
        setSize(400, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                buttons[i][j] = new JButton("Button " + (i * 3 + j + 1)); 
                buttons[i][j].addMouseListener(this); 
                add(buttons[i][j]);}} 
setVisible(true); 
    } 
   @Override 
    public void mouseClicked(MouseEvent e) { 
        JButton source = (JButton) e.getSource(); 
        source.setBackground(Color.CYAN); 
        System.out.println(source.getText() + " clicked");} 
 
    @Override 
    public void mousePressed(MouseEvent e) { } 
 
    @Override 
    public void mouseReleased(MouseEvent e) { } 
 
    @Override 
    public void mouseEntered(MouseEvent e) { 
        JButton source = (JButton) e.getSource(); 
        source.setBackground(Color.LIGHT_GRAY);} 
 
    @Override 
    public void mouseExited(MouseEvent e) { 
        JButton source = (JButton) e.getSource(); 
        source.setBackground(null);  
    } 
 
    public static void main(String[] args) { 
        new MouseListenerGridDemo(); 
    }
}