package ma.moktafiioc.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXml {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	}
}
