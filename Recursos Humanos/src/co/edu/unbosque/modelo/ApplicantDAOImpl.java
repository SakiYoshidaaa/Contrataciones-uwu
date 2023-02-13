package co.edu.unbosque.modelo;

import java.util.ArrayList;

/**
 * 
 * @author Harold Duarte
 * @author Catalina Borda
 * 
 */

public class ApplicantDAOImpl implements ApplicantDAO{
	
	ArrayList<ApplicantDTO> applicants = new ArrayList<ApplicantDTO>();
	

	@Override
	public void create(String name, String surname, int id, int age, String job) {
		applicants.add(new ApplicantDTO(name, surname, id, age, job));
	}

	@Override
	public boolean verify(int id) {
		for(int i = 0; i<applicants.size();i++) {
			if(id == applicants.get(i).getId()) {
				select(i);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int select(int aux) {
		return aux;
	}

	@Override
	public void update(int selected, String name, String surname, int id, int age, String job) {
		applicants.get(selected).setName(name);
		applicants.get(selected).setSurname(surname);
		applicants.get(selected).setId(id);
		applicants.get(selected).setAge(age);
		applicants.get(selected).setJob(job);
	}

	@Override
	public void delete(int selected) {
		applicants.remove(selected);
	}

	@Override
	public String list() {
		String str = "";
		for(int i = 0; i<applicants.size();i++) {
			str = str + applicants.get(i).toString();
		}
		return str;
	}
	
	public ArrayList<ApplicantDTO> getApplicants() {
		return applicants;
	}
	
	public void setApplicants(ArrayList<ApplicantDTO> applicants) {
		this.applicants = applicants;
	}
}