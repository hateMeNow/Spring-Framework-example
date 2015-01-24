package it.manuelc;

public class TxtReportService  {

	private Report report;
	
	public void setReport(Report report)
	{
		this.report=report;
	}
	public void generaRisposta()
	{
		System.out.println(report.sendMess());
	}
}
