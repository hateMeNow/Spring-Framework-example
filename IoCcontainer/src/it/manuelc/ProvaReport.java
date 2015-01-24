package it.manuelc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProvaReport {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
	     TxtReportService txtreport = (TxtReportService)ctxt.getBean("Txtreportservice");
	     txtreport.generaRisposta();
	}

}
