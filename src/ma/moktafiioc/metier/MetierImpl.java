package ma.moktafiioc.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.moktafiioc.dao.IDao;
//@Component("metier")
public class MetierImpl implements IMetier{
	//@Autowired
	private IDao dao;
	public void setDao(IDao dao) {
		this.dao = dao;
		if(this.dao != null)
		System.out.println("Dao a été Injecté");
	}
	@Override
	public String Traitement() {
		String d = dao.getData();
		String res = "Traitement " + d;
		return res;
	}
	public MetierImpl() {
		System.out.println("MetierImpl instancié");
	}
}
