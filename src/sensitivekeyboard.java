import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class sensitivekeyboard implements KeyListener{
public static void main(String[] args) {
	new sensitivekeyboard().doit();
		
	
	
	
}

private void doit() {
	JFrame fra = new JFrame();
	JPanel pan = new JPanel();
	fra.addKeyListener(this);
	pan.setVisible(true);
	fra.add(pan);
	fra.pack();
	fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fra.setVisible(true);
}
	
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyChar()=='h') {
		speak("ouch");
		System.out.println("click");
	}
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}

