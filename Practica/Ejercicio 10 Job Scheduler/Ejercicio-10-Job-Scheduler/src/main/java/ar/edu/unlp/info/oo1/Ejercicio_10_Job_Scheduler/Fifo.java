package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

public class Fifo extends JobScheduler {
	public JobDescription next() {
        
        JobDescription nextJob = jobs.remove(0);
        this.unschedule(nextJob);
        return nextJob;
    }
}