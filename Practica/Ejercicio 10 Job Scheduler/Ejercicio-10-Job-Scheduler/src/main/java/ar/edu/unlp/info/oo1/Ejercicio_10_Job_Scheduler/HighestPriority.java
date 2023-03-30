package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

import java.util.List;

public class HighestPriority implements Strategy{

	@Override
	public JobDescription estrategiaJob(List<JobDescription> jobs) {
		// TODO Auto-generated method stub
		if (!jobs.isEmpty()) {
		    return jobs.remove(
		        jobs.stream()
		            .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
		            .orElse(null)
		    );
		} else {
		    return null; // O devolver cualquier otro valor que tenga sentido en tu caso
		}
	}

}
