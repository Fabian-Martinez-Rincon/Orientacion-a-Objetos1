package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

public class Lifo extends JobScheduler {
    
    public JobDescription next() {
        
        JobDescription nextJob = jobs.remove(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
    }

}