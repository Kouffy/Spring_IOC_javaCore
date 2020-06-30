package ma.moktafiioc.presentation;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

import ma.moktafiioc.dao.IDao;
import ma.moktafiioc.metier.IMetier;

public class Presentation {

	public static void main(String[] args) {
		try
		{
		//Lire le fichier de configuration
		Scanner scanner = new Scanner(new File("configuration.txt"));
		//recuperer le nom de la 1er classe
		String daoClassName = scanner.next();
		//recuperer le nom de la 2eme classe
		String metierClassName = scanner.next();
		//rechercher la classe an se basent de son nom
		Class cDao = Class.forName(daoClassName);
		//recuperer son constructeur
		Constructor cDaoconst = (Constructor)cDao.getConstructor();
		//crée unne ouvelle instance
		IDao dao = (IDao)cDaoconst.newInstance();
		//meme procedure
		Class cMetier= Class.forName(metierClassName);
		Constructor cMetierconst = (Constructor)cMetier.getConstructor();
		IMetier metier = (IMetier)cMetierconst.newInstance();
		//Recupere le setter de dao a partir de la classe metierimpl
		Method m = cMetier.getMethod("setDao", new Class[] {IDao.class});
		//invoquer le setter pour créé une instance
		m.invoke(metier, new Object[] {dao});
		//Tester La methode Traitement
		System.out.println(metier.Traitement());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
