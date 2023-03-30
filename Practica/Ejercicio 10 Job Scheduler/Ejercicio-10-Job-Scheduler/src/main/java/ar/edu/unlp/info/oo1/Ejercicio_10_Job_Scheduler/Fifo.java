package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

import java.util.List;

public class Fifo extends JobScheduler implements Strategy  {

	@Override
	public JobDescription estrategiaJob(List<JobDescription> jobs) {
		JobDescription nextJob = jobs.remove(0);
		return nextJob;
	}

}
