package ma.moktafiioc.dao;

import org.springframework.stereotype.Component;

//@Component("dao")
public class DaoImpl implements IDao {
	@Override
	public String getData() {
		String data = "Donnée de la base de donnée";
		return data;
	}

	public DaoImpl() {
		System.out.println("DaoImpl instancié");
	}
}
