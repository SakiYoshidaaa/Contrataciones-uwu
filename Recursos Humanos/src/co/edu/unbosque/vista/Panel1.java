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

public class Panel1 extends JPanel{

	private static final long serialVersionUID = 1L;
	
	Font font1;
	JLabel title;
	JButton create,read,update,delete; 
	
	/**
	 * This is the constructor method for the initial panel. It contains the title (JLabel), the options (JButton) and their characteristics.
	 */
	
	public Panel1() {
		setBounds(0,0,900,600);
		setLayout(null);
		setBackground(Color.white);
		
		font1 = new Font("Comic Sans MS",Font.BOLD,25);
		
		title = new JLabel();
		title.setBounds(60,50,780,50);
		title.setText("Welcome to the applicant program, select what you want to do:");
		title.setFont(font1);
		title.setForeground(Color.black);
		
		create = new JButton();
		create.setBounds(175,200,175,50);
		create.setText("Create");
		create.setFont(font1);
		create.setActionCommand("create");
		create.setBackground(new Color(65,125,10));
		create.setForeground(Color.white);
		
		read = new JButton();
		read.setBounds(550,200,175,50);
		read.setText("Read");
		read.setFont(font1);
		read.setActionCommand("read");
		read.setBackground(new Color(220,70,25));
		read.setForeground(Color.white);
		
		update = new JButton();
		update.setBounds(175,350,175,50);
		update.setText("Update");
		update.setFont(font1);
		update.setActionCommand("update");
		update.setBackground(new Color(35,110,160));
		update.setForeground(Color.white);
		
		delete = new JButton();
		delete.setBounds(550,350,175,50);
		delete.setText("Delete");
		delete.setFont(font1);
		delete.setActionCommand("delete");
		delete.setBackground(new Color(175,25,20));
		delete.setForeground(Color.white);
		
		add(title);
		add(create);
		add(read);
		add(update);
		add(delete);
	}

	public JButton getCreate() {
		return create;
	}public void setCreate(JButton create) {
		this.create = create;
	}

	public JButton getRead() {
		return read;
	}public void setRead(JButton read) {
		this.read = read;
	}

	public JButton getUpdate() {
		return update;
	}public void setUpdate(JButton update) {
		this.update = update;
	}

	public JButton getDelete() {
		return delete;
	}public void setDelete(JButton delete) {
		this.delete = delete;
	}
}