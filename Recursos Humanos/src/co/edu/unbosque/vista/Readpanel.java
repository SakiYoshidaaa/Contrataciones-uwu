package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Harold Duarte
 * @author Catalina Borda
 *
 */

public class Readpanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	Font font1;
	Font font2;
	JLabel title;
	JLabel content;
	JButton back;
	
	/**
	 * This is the constructor method for the reading panel. It contains the elements that allows to see the applicant´s list.
	 */
	
	public Readpanel() {
		setBounds(0,0,900,600);
		setLayout(null);
		setBackground(Color.white);
		
		font1 = new Font("Comic Sans MS",Font.BOLD,25);
		font2 = new Font("Comic Sans MS",Font.BOLD,20);
		
		title = new JLabel();
		title.setBounds(60,50,780,50);
		title.setText("Applicants:");
		title.setFont(font1);
		title.setForeground(Color.black);
		
		content = new JLabel();
		content.setBounds(60,110,760,400);
		content.setVerticalAlignment(1);
		content.setFont(font2);
		content.setForeground(Color.black);
		
		back = new JButton();
		back.setBounds(625,450,175,50);
		back.setText("Back");
		back.setFont(font1);
		back.setActionCommand("backread");
		back.setBackground(new Color(120,120,125));
		back.setForeground(Color.white);
		
		add(title);
		add(content);
		add(back);
	}

	public JLabel getContent() {
		return content;
	}public void setContent(JLabel content) {
		this.content = content;
	}

	public JButton getBack() {
		return back;
	}public void setBack(JButton back) {
		this.back = back;
	}
}