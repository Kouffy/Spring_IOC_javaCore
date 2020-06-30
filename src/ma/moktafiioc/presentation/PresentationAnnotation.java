package ma.moktafiioc.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ma.moktafiioc.metier.IMetier;

public class PresentationAnnotation {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("ma.moktafiioc.dao","ma.moktafiioc.metier");
		System.out.println(ctx.getBean(IMetier.class).Traitement());
	}

}
