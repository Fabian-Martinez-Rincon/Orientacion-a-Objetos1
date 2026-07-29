package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

public class JobDescription {
	
	private double effort;
	
	private int priority;
	
	private String description;
	
	public JobDescription (double anEffort, int aPriority, String aDescription) {
		this.effort = anEffort;
		this.priority = aPriority;
		this.description = aDescription;
	}
		
	public double getEffort() {
			return effort;
	} 
	
	public int getPriority() {
		return priority;
	}
	
	public String getDescription() {
		return this.description;
	}
}
