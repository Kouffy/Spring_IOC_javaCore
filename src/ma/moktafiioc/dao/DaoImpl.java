package ma.moktafiioc.dao;

import org.springframework.stereotype.Component;

//@Component("dao")
public class DaoImpl implements IDao {
	@Override
	public String getData() {
		String data = "Donn�e de la base de donn�e";
		return data;
	}

	public DaoImpl() {
		System.out.println("DaoImpl instanci�");
	}
}
