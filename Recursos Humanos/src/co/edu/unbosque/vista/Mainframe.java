package co.edu.unbosque.vista;

import javax.swing.JFrame;

/**
 * 
 * @author Harold Duarte
 * @author Catalina Borda
 * 
 */

public class Mainframe extends JFrame{

	private static final long serialVersionUID = 1L;
	
	Panel1 p1;
	Createpanel cp;
	Readpanel rp;
	Searchpanel sp;
	Updatepanel up;
	Deletepanel dp;
	
	/**
	 * This is the constructor method for the main frame which is going to show the different JPanel based on the user selection.
	 */
	
	public Mainframe() {
		setBounds(0,0,900,600);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p1 = new Panel1();
		p1.setVisible(true);
		cp = new Createpanel();
		cp.setVisible(false);
		rp = new Readpanel();
		rp.setVisible(false);
		sp = new Searchpanel();
		sp.setVisible(false);
		up = new Updatepanel();
		up.setVisible(false);
		dp = new Deletepanel();
		dp.setVisible(false);
		
		add(p1);
		add(cp);
		add(rp);
		add(sp);
		add(up);
		add(dp);
	}

	public Panel1 getP1() {
		return p1;
	}public void setP1(Panel1 p1) {
		this.p1 = p1;
	}

	public Createpanel getCp() {
		return cp;
	}public void setCp(Createpanel cp) {
		this.cp = cp;
	}

	public Readpanel getRp() {
		return rp;
	}public void setRp(Readpanel rp) {
		this.rp = rp;
	}

	public Searchpanel getSp() {
		return sp;
	}public void setSp(Searchpanel sp) {
		this.sp = sp;
	}

	public Updatepanel getUp() {
		return up;
	}public void setUp(Updatepanel up) {
		this.up = up;
	}

	public Deletepanel getDp() {
		return dp;
	}public void setDp(Deletepanel dp) {
		this.dp = dp;
	}
}