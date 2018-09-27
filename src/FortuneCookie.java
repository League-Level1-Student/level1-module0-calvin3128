import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		


		
	}
	
	public void showButton() {
		System.out.println("Button Clicked");
		JFrame frame = new JFrame();
		frame.setSize(100,100);
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		Random randd = new Random();
		int rand = randd.nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "good things will happen");
		}else if(rand==1) {
			JOptionPane.showMessageDialog(null, "youll eat some good food");
		}else if(rand==2) {
			JOptionPane.showMessageDialog(null, "someday youll get a score better than a 40% on a test");
		}else if(rand==3) {
			JOptionPane.showMessageDialog(null, "*fortune*");
		}else if(rand==4) {
			JOptionPane.showMessageDialog(null, "i ran out of ideas");
		}
	}
	
}
