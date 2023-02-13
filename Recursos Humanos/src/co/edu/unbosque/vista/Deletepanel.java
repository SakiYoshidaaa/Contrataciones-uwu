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

public class Deletepanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	Font font1;
	Font font2;
	JLabel title;
	JButton delete, back;
	
	/**
	 * This is the constructor method for the deleting panel. It contains the confirmation question to delete an applicant of the program.
	 */
	
	public Deletepanel() {
		setBounds(0,0,900,600);
		setLayout(null);
		setBackground(Color.white);
		
		font1 = new Font("Comic Sans MS",Font.BOLD,25);
		font2 = new Font("Comic Sans MS",Font.BOLD,20);
		
		title = new JLabel();
		title.setBounds(60,50,780,50);
		title.setText("Are you sure you want to delete the applicant selected?");
		title.setFont(font1);
		title.setForeground(Color.black);
		
		delete = new JButton();
		delete.setBounds(225,250,175,50);
		delete.setText("Delete");
		delete.setFont(font1);
		delete.setActionCommand("deleteapplicant");
		delete.setBackground(new Color(175,25,20));
		delete.setForeground(Color.white);
		
		back = new JButton();
		back.setBounds(500,250,175,50);
		back.setText("Back");
		back.setFont(font1);
		back.setActionCommand("backdelete");
		back.setBackground(new Color(120,120,125));
		back.setForeground(Color.white);
		
		add(title);
		add(delete);
		add(back);
	}

	public JButton getDelete() {
		return delete;
	}public void setDelete(JButton delete) {
		this.delete = delete;
	}

	public JButton getBack() {
		return back;
	}public void setBack(JButton back) {
		this.back = back;
	}
}