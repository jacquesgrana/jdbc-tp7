package dal;

import java.sql.SQLException;
import java.util.List;

import bo.Departement;


public interface IDeptDAO {
	
	public List<Departement> findAll() throws SQLException;

}
