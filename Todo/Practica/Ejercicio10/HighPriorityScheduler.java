public class HighPriorityScheduler extends JobScheduler {
    
    public JobDescription next() {
        
        JobDescription nextJob = jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
            this.unschedule(nextJob);
            return nextJob;
    }
}