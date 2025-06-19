import java.awt.*; 
class Demo { 
    public static void main(String[] args) { 
        Frame f = new Frame("Details"); 
        f.setLayout(null); 
        f.setSize(400, 400); 
        f.setVisible(true); 
        Label l0 = new Label("Name:"); 
        l0.setBounds(30, 50, 50, 20); 
        TextField t0 = new TextField(); 
        t0.setBounds(100, 50, 150, 20); 
        f.add(l0); 
        f.add(t0); 
        Label l1 = new Label("E-Mail:"); 
        l1.setBounds(30, 90, 50, 20); 
        TextField t1 = new TextField(); 
        t1.setBounds(100, 90, 150, 20); 
        f.add(l1); 
        f.add(t1); 
        Label l2 = new Label("Address:"); 
        l2.setBounds(30, 130, 60, 20); 
        TextArea t2 = new TextArea(); 
        t2.setBounds(100, 130, 200, 60); 
        f.add(l2); 
        f.add(t2); 
        Label l3 = new Label("Password:"); 
        l3.setBounds(30, 210, 60, 20); 
        TextField t3 = new TextField(); 
        t3.setEchoChar('*'); // Hide input 
        t3.setBounds(100, 210, 150, 20); 
        f.add(l3); 
        f.add(t3); 
        Button btn = new Button("Submit"); 
        btn.setBounds(130, 260, 100, 30); 
        f.add(btn);}} 
