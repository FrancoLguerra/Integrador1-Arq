package interfaces;

import entities.clientes;

public interface DAO<T> {
	
	public void insert(<T> T);
	public void delete(int id);
	public void update(<T> T);
	public void get(int id);
	public void getAll();
	
	

}
