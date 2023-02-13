package co.edu.unbosque.modelo;

/**
 * 
 * @author Harold Duarte
 * @author Catalina Borda
 * 
 */

public interface ApplicantDAO {
	
	public void create(String name, String surname, int id, int age, String job);
	
	public boolean verify(int id);
	
	public int select(int aux);
	
	public void update(int selected, String name, String surname, int id, int age, String job);
	
	public void delete(int selected);
	
	public String list();
}
