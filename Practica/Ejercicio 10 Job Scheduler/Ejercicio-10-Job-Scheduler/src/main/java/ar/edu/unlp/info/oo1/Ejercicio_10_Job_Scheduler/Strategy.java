package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

import java.util.*;

public interface Strategy {
	public JobDescription estrategiaJob(List<JobDescription> jobs);
}
