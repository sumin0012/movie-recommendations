package Project;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Action extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JRadioButton [] radio = new JRadioButton [4];
	private ImageIcon [] image = {
			new ImageIcon("images/A1.jpg"),
			new ImageIcon("images/A2.jpg"),
			new ImageIcon("images/A3.jpg"),
			new ImageIcon("images/A4.jpg")};
	private ImageIcon [] image1 = {
			new ImageIcon("images/A1-1.jpg"),
			new ImageIcon("images/A2-1.jpg"),
			new ImageIcon("images/A3-1.jpg"),
			new ImageIcon("images/A4-1.jpg")};	
	
	private JLabel imageLabel = new JLabel();
	
	public Action() {
		setTitle("액션 추천영화");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(image[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(10000,800);
		setVisible(true);
		}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			
			if(radio[0].isSelected())
				imageLabel.setIcon(image1[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image1[1]);
			else if(radio[2].isSelected())
				imageLabel.setIcon(image1[2]);
			else
				imageLabel.setIcon(image1[3]);
		}
	}
	
	
	public static void main(String [] args) {
		new Romance();
	}

}