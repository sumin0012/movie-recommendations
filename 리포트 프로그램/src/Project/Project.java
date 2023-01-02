package Project;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Project extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JRadioButton [] radio = new JRadioButton [5];
	private String [] text = {"로맨스", "스릴러", "코미디", "액션", "판타지"};
	
	
	private JLabel imageLabel = new JLabel();
	
	public Project() {
		setTitle("Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0; i<radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		
		
		ImageIcon icon = new ImageIcon("images/icon1.jpg");
		JLabel icon1 = new JLabel(icon);
		c.add(icon1);
		
		setSize(800,800);
		setVisible(true);
		}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected()) {
				new Romance();   //새로운 창으로 class Romance가 뜹니다.
			}
			else if(radio[1].isSelected()) {
				new Thriller();  //새로운 창으로 class Thriller가 뜹니다.
			}
				
            else if(radio[2].isSelected()) {
            	new Comedy();  //새로운 창으로 class Comedy가 뜹니다.
			}
			
            else if(radio[3].isSelected()) {
            	new Action();  //새로운 창으로 class Action이 뜹니다.
			}
			else {
				new Fantasy();  //새로운 창으로 class Fantasy가 뜹니다.
			}
			   
		}
	}
	
	
	public static void main(String [] args) {
		   new Project();
		}
}