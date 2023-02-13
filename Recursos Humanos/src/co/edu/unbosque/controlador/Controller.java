package co.edu.unbosque.controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import co.edu.unbosque.model.persistence.FileHandler;
import co.edu.unbosque.modelo.ApplicantDAOImpl;
import co.edu.unbosque.modelo.ApplicantDTO;
import co.edu.unbosque.vista.*;

/**
 * 
 * @author Harold Duarte
 * @author Catalina Borda
 * 
 */

public class Controller implements ActionListener {

	private Mainframe mf1;
	private ApplicantDAOImpl adi;
	private int uord = -1;
	private int selected = -1;
	private FileHandler fh;

	/**
	 * This is the constructor method of the controller. It contains the
	 * ActionListener of every button on the program.
	 * 
	 * @throws IOException
	 * @throws SecurityException
	 */

	public Controller() {
		mf1 = new Mainframe();
		adi = new ApplicantDAOImpl();
		mf1.getP1().getCreate().addActionListener(this);
		mf1.getP1().getRead().addActionListener(this);
		mf1.getP1().getUpdate().addActionListener(this);
		mf1.getP1().getDelete().addActionListener(this);
		mf1.getCp().getCreate().addActionListener(this);
		mf1.getCp().getBack().addActionListener(this);
		mf1.getRp().getBack().addActionListener(this);
		mf1.getSp().getNext().addActionListener(this);
		mf1.getSp().getBack().addActionListener(this);
		mf1.getUp().getUpdate().addActionListener(this);
		mf1.getUp().getBack().addActionListener(this);
		mf1.getDp().getDelete().addActionListener(this);
		mf1.getDp().getBack().addActionListener(this);
		this.fh = new FileHandler();
		adi.setApplicants(fh.readfile());

	}

	/**
	 * This method start the sequence of the program making the frame visible.
	 */

	public void run() {
		mf1.setVisible(true);
	}

	/**
	 * This ActionPerformed method gives functionality to every button.
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("create")) {
			mf1.getP1().setVisible(false);
			mf1.getCp().setVisible(true);

		}
		if (e.getActionCommand().equals("read")) {
			String str = "";
			if (adi.getApplicants().isEmpty()) {
				JOptionPane.showMessageDialog(null, "There´s no applicants to show");
			} else {
				for (int i = 0; i < adi.getApplicants().size(); i++) {
					str = str + adi.getApplicants().get(i).toString() + "<p>";
				}
				mf1.getRp().getContent().setText("<html>" + str + "</html>");
				mf1.getP1().setVisible(false);
				mf1.getRp().setVisible(true);
			}
		}
		if (e.getActionCommand().equals("update")) {
			if (adi.getApplicants().isEmpty()) {
				JOptionPane.showMessageDialog(null, "There's no applicants to update");
			} else {
				uord = 1;
				mf1.getP1().setVisible(false);
				mf1.getSp().setVisible(true);
			}

		}
		if (e.getActionCommand().equals("delete")) {
			if (adi.getApplicants().isEmpty()) {
				JOptionPane.showMessageDialog(null, "There's no applicants to delete");
			} else {
				uord = 2;
				mf1.getP1().setVisible(false);
				mf1.getSp().setVisible(true);
			}

		}
		if (e.getActionCommand().equals("createapplicant")) {

			// verificar el tipo de los datos y crear el aplicante

			if ((mf1.getCp().getFname().getText().isEmpty()) || (mf1.getCp().getSurname().getText().isEmpty())
					|| mf1.getCp().getId().getText().isEmpty() || mf1.getCp().getAge().getText().isEmpty()
					|| mf1.getCp().getJob().getText().isEmpty() || notonlyletters(mf1.getCp().getFname().getText())
					|| notonlyletters(mf1.getCp().getSurname().getText()) || verifynoint(mf1.getCp().getId().getText())
					|| verifynoint(mf1.getCp().getAge().getText()) || notonlyletters(mf1.getCp().getJob().getText())) {

				JOptionPane.showMessageDialog(null, "Try to enter the info correctly");

			} else if (idrepeated(Integer.parseInt(mf1.getCp().getId().getText()))) {
				JOptionPane.showMessageDialog(null, "The id already exists in the program");
			} else {
				adi.create(mf1.getCp().getFname().getText(), mf1.getCp().getSurname().getText(),
						Integer.parseInt(mf1.getCp().getId().getText()),
						Integer.parseInt(mf1.getCp().getAge().getText()), mf1.getCp().getJob().getText());
				System.out.println("Lst 1 = " + adi.getApplicants().size());
				fh.writefile(adi.getApplicants());
				ArrayList<ApplicantDTO> aux = fh.readfile();
				System.out.println("lst 2 = " + aux.size());
				JOptionPane.showMessageDialog(null, "Applicant registered ");

			}

		}
		if (e.getActionCommand().equals("backcreate")) {
			mf1.getCp().setVisible(false);
			mf1.getP1().setVisible(true);

		}
		if (e.getActionCommand().equals("backread")) {
			mf1.getRp().setVisible(false);
			mf1.getP1().setVisible(true);

		}
		if (e.getActionCommand().equals("next")) {

			// verificar si el aplicante existe, si es update o delete y redirigir

			if (verifynoint(mf1.getSp().getKeyword().getText())) {
				JOptionPane.showMessageDialog(null, "Try to enter the info correctly");
			} else {
				for (int i = 0; i < adi.getApplicants().size(); i++) {
					if (Integer.parseInt(mf1.getSp().getKeyword().getText()) == adi.getApplicants().get(i).getId()) {
						selected = i;
					}
				}
				if (selected != -1) {
					if (uord == 1) {
						mf1.getSp().setVisible(false);
						mf1.getUp().setVisible(true);
					} else if (uord == 2) {
						mf1.getSp().setVisible(false);
						mf1.getDp().setVisible(true);
					}
				} else {
					JOptionPane.showMessageDialog(null, "The id doesn't exist on the program");
				}
			}

		}
		if (e.getActionCommand().equals("backsearch")) {
			mf1.getSp().setVisible(false);
			mf1.getP1().setVisible(true);

		}
		if (e.getActionCommand().equals("updateapplicant")) {

			// verificar el tipo de datos y actualizar el aplicante

			if ((mf1.getUp().getFname().getText().isEmpty()) || (mf1.getUp().getSurname().getText().isEmpty())
					|| mf1.getUp().getId().getText().isEmpty() || mf1.getUp().getAge().getText().isEmpty()
					|| mf1.getUp().getJob().getText().isEmpty() || notonlyletters(mf1.getUp().getFname().getText())
					|| notonlyletters(mf1.getUp().getSurname().getText()) || verifynoint(mf1.getUp().getId().getText())
					|| verifynoint(mf1.getUp().getAge().getText()) || notonlyletters(mf1.getUp().getJob().getText())) {

				JOptionPane.showMessageDialog(null, "Try to enter the info correctly");

			} else if (idrepeated(Integer.parseInt(mf1.getUp().getId().getText()))) {
				JOptionPane.showMessageDialog(null, "The id already exists in the program");
			} else {
				adi.update(selected, mf1.getUp().getFname().getText(), mf1.getUp().getSurname().getText(),
						Integer.parseInt(mf1.getUp().getId().getText()),
						Integer.parseInt(mf1.getUp().getAge().getText()), mf1.getUp().getJob().getText());
				selected = -1;
				fh.writefile(adi.getApplicants());
				JOptionPane.showMessageDialog(null, "Applicant registered ");
			}
		}
		if (e.getActionCommand().equals("backupdate")) {
			mf1.getUp().setVisible(false);
			mf1.getP1().setVisible(true);

		}
		if (e.getActionCommand().equals("deleteapplicant")) {

			// eliminar el aplicante

			adi.delete(selected);
			selected = -1;
			fh.writefile(adi.getApplicants());
			JOptionPane.showMessageDialog(null, "The applicant has been deleted from the program");

		}
		if (e.getActionCommand().equals("backdelete")) {
			mf1.getDp().setVisible(false);
			mf1.getP1().setVisible(true);

		}
	}

	public boolean verifynoint(String str1) {
		try {
			Integer.parseInt(str1);
			return false;
		} catch (Exception ex) {
			return true;
		}
	}

	public boolean notonlyletters(String str2) {
		if (str2.matches("^[a-zA-Z ]*$")) {
			return false;
		} else {
			return true;
		}
	}

	public boolean idrepeated(int id) {
		if (adi.getApplicants().isEmpty()) {
			return false;
		} else {
			for (int i = 0; i < adi.getApplicants().size(); i++) {
				if (id == adi.getApplicants().get(i).getId()) {
					return true;
				}
			}
		}
		return false;
	}
}