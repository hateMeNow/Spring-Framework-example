package it.manuelc.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support. ClassPathXmlApplicationContext;



public class HelloWorldApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
				HelloFromSpring helloWorld = (HelloFromSpring) context.getBean("helloWorld");
				helloWorld.display();
	}
	 
}
