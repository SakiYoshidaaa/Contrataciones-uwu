package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.edu.unbosque.modelo.ApplicantDTO;

public class FileHandler {
	private ObjectInputStream input;
	private ObjectOutputStream output;
	private File file = new File("./src/data/us.dat");
	
	public FileHandler() {
		if (file.exists()) {
		}else {
			try {
				file.createNewFile();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public void writefile(ArrayList<ApplicantDTO> applicant) {
		try {
			output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(applicant);
			output.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	@SuppressWarnings("unchecked")
	public ArrayList<ApplicantDTO> readfile() {
		ArrayList<ApplicantDTO> read = new ArrayList<ApplicantDTO>();
		try {
			this.input = new ObjectInputStream(new FileInputStream(file));
			read = (ArrayList<ApplicantDTO>)input.readObject();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return read;
	}

	

}
