package co.edu.unbosque.modelo;

import java.io.Serializable;

/**
 * 
 * @author Harold Duarte
 * @author Catalina Borda
 * 
 */

public class ApplicantDTO implements Serializable{
	
	private String name;
	private String surname;
	private int id;
	private int age;
	private String job;
	
	public ApplicantDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ApplicantDTO(String name, String surname, int id, int age, String job) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}public void setJob(String job) {
		this.job = job;
	}
	
	public String toString() {
		String str = "Name: "+this.name+" Surname: "+this.surname+" Id: "+this.id+" Age: "+this.age+" Job: "+this.job;
		return str;
	}
}