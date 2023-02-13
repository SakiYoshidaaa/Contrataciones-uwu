package co.edu.unbosque.vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Harold Duarte
 * @author Catalina Borda
 *
 */

public class Searchpanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	Font font1;
	Font font2;
	JLabel title;
	JTextField keyword;
	JButton next, back;
	
	/**
	 * This is the constructor method for the "searching" (verifying). It contains a space to write the id and then delete or update an applicant.
	 */
	
	public Searchpanel() {
		setBounds(0,0,900,600);
		setLayout(null);
		setBackground(Color.white);
		
		font1 = new Font("Comic Sans MS",Font.BOLD,25);
		font2 = new Font("Comic Sans MS",Font.BOLD,20);
		
		title = new JLabel();
		title.setBounds(60,50,780,50);
		title.setText("Put the Id of the applicant you want to update or delete");
		title.setFont(font1);
		title.setForeground(Color.black);
		
		keyword = new JTextField();
		keyword.setBounds(60,150,400,40);
		keyword.setFont(font2);
		
		next = new JButton();
		next.setBounds(225,250,175,50);
		next.setText("Next");
		next.setFont(font1);
		next.setActionCommand("next");
		next.setBackground(new Color(120,120,125));
		next.setForeground(Color.white);
		
		back = new JButton();
		back.setBounds(500,250,175,50);
		back.setText("Back");
		back.setFont(font1);
		back.setActionCommand("backsearch");
		back.setBackground(new Color(120,120,125));
		back.setForeground(Color.white);
		
		add(title);
		add(keyword);
		add(next);
		add(back);
	}

	public JTextField getKeyword() {
		return keyword;
	}public void setKeyword(JTextField keyword) {
		this.keyword = keyword;
	}

	public JButton getNext() {
		return next;
	}public void setNext(JButton next) {
		this.next = next;
	}

	public JButton getBack() {
		return back;
	}public void setBack(JButton back) {
		this.back = back;
	}
}