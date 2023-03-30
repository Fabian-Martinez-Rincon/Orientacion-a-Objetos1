package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

import java.util.List;

public class MostEffort implements Strategy{

	@Override
	public JobDescription estrategiaJob(List<JobDescription> jobs) {
		// TODO Auto-generated method stub
		JobDescription job = jobs.stream()
     			.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
     			.orElse(null);
		return jobs.remove(job);
	}

}
