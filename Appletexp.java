import java.applet.Applet; 
import java.awt.Graphics; 
public class Appletexp extends Applet{ 
public void init(){ 
showStatus("Applet initialisation."); 
try{ 
Thread.sleep(1000); 
} 
catch (Exception e){ 
} 
} 
public void start(){ 
showStatus("Applet Started."); 
} 
public void paint(Graphics g){ 
g.drawString("This is an applet example.", 30, 50); 
} 
public void stop(){ 
showStatus("Applet has stopped."); 
} 
public void destroy(){ 
showStatus("Applet has terminated."); 
try{ 
Thread.sleep(1000); 
} 
catch (Exception e){ 
} 
} 
} 
