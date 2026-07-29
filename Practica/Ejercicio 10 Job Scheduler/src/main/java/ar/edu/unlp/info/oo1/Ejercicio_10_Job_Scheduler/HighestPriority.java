package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

public class HighestPriority extends JobScheduler {
    
    public JobDescription next() {
        
        JobDescription nextJob = jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
            this.unschedule(nextJob);
            return nextJob;
    }
    
}