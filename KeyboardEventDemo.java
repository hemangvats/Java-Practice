import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
public class KeyboardEventDemo extends JFrame implements KeyListener { 
JLabel label; 
JTextField textField; 
public KeyboardEventDemo() { 
setTitle("Keyboard Event Demo"); 
setSize(400, 200); 
setLayout(new FlowLayout()); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
label = new JLabel("Type something:"); 
textField = new JTextField(20); 
textField.addKeyListener(this); 
add(label); 
add(textField); 
setVisible(true);}   
@Override 
public void keyTyped(KeyEvent e) { 
System.out.println("Key Typed: " + e.getKeyChar()); } 
@Override 
public void keyPressed(KeyEvent e) { 
System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));}     
@Override 
public void keyReleased(KeyEvent e) { 
System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));} 
public static void main(String[] args) { 
new KeyboardEventDemo(); } 
} 