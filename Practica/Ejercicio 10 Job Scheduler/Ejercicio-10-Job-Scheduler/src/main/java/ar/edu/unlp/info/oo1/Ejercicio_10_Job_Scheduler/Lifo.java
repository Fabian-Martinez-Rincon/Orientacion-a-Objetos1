package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

import java.util.List;

public class Lifo implements Strategy{

	@Override
	public JobDescription estrategiaJob(List<JobDescription> jobs) {
		return jobs.remove(jobs.size()-1);
	}

}
