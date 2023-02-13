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

public class Createpanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	Font font1;
	Font font2;
	JLabel title;
	JLabel sfname, ssurname, sid, sage, sjob;
	JTextField fname, surname, id, age, job;
	JButton create, back;
	
	/**
	 * This is the constructor method for the creating panel. It contains the spaces that allows to put the info of a new applicant and save it.
	 */
	
	public Createpanel() {
		setBounds(0,0,900,600);
		setLayout(null);
		setBackground(Color.white);
		
		font1 = new Font("Comic Sans MS",Font.BOLD,25);
		font2 = new Font("Comic Sans MS",Font.BOLD,20);
		
		title = new JLabel();
		title.setBounds(60,50,780,50);
		title.setText("Fill the blanks below to creat a new applicant:");
		title.setFont(font1);
		title.setForeground(Color.black);
		
		sfname = new JLabel();
		sfname.setBounds(60,110,780,40);
		sfname.setText("Name:");
		sfname.setFont(font2);
		sfname.setForeground(Color.black);
		
		fname = new JTextField();
		fname.setBounds(60,150,400,40);
		fname.setFont(font2);
		
		ssurname = new JLabel();
		ssurname.setBounds(60,190,780,40);
		ssurname.setText("Surname:");
		ssurname.setFont(font2);
		ssurname.setForeground(Color.black);
		
		surname = new JTextField();
		surname.setBounds(60,230,400,40);
		surname.setFont(font2);
		
		sid = new JLabel();
		sid.setBounds(60,270,780,40);
		sid.setText("Id:");
		sid.setFont(font2);
		sid.setForeground(Color.black);
		
		id = new JTextField();
		id.setBounds(60,310,400,40);
		id.setFont(font2);
		
		sage = new JLabel();
		sage.setBounds(60,350,780,40);
		sage.setText("Age:");
		sage.setFont(font2);
		sage.setForeground(Color.black);
		
		age = new JTextField();
		age.setBounds(60,390,400,40);
		age.setFont(font2);
		
		sjob = new JLabel();
		sjob.setBounds(60,430,780,40);
		sjob.setText("Job:");
		sjob.setFont(font2);
		sjob.setForeground(Color.black);
		
		job = new JTextField();
		job.setBounds(60,470,400,40);
		job.setFont(font2);
		
		create = new JButton();
		create.setBounds(575,225,175,50);
		create.setText("Create");
		create.setFont(font1);
		create.setActionCommand("createapplicant");
		create.setBackground(new Color(65,125,10));
		create.setForeground(Color.white);
		
		back = new JButton();
		back.setBounds(575,325,175,50);
		back.setText("Back");
		back.setFont(font1);
		back.setActionCommand("backcreate");
		back.setBackground(new Color(120,120,125));
		back.setForeground(Color.white);
		
		add(title);
		add(sfname);
		add(fname);
		add(ssurname);
		add(surname);
		add(sid);
		add(id);
		add(sage);
		add(age);
		add(sjob);
		add(job);
		add(create);
		add(back);
	}

	public JTextField getFname() {
		return fname;
	}public void setFname(JTextField fname) {
		this.fname = fname;
	}

	public JTextField getSurname() {
		return surname;
	}public void setSurname(JTextField surname) {
		this.surname = surname;
	}

	public JTextField getId() {
		return id;
	}public void setId(JTextField id) {
		this.id = id;
	}

	public JTextField getAge() {
		return age;
	}public void setAge(JTextField age) {
		this.age = age;
	}

	public JTextField getJob() {
		return job;
	}public void setJob(JTextField job) {
		this.job = job;
	}

	public JButton getCreate() {
		return create;
	}public void setCreate(JButton create) {
		this.create = create;
	}

	public JButton getBack() {
		return back;
	}public void setBack(JButton back) {
		this.back = back;
	}
}