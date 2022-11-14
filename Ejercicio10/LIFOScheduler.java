public class LIFOScheduler extends JobScheduler {
    
    public JobDescription next() {
        JobDescription nextJob = jobs.remove(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
    }
}