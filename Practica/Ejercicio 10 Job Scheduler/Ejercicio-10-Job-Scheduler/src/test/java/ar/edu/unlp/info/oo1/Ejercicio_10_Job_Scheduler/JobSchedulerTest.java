package ar.edu.unlp.info.oo1.Ejercicio_10_Job_Scheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
	protected JobDescription firstJob;
	protected JobDescription highestPriorityJob;
	protected JobDescription mostEffortJob;
	protected JobDescription lastJob;
  
    
    private void initializeJobs() {
    	firstJob = new JobDescription (1, 1, "Este es el primero");
		highestPriorityJob = new JobDescription (1, 100, "Este es el de m�s prioridad");
		mostEffortJob = new JobDescription (100, 1, "Este es el de m�s esfuerzo");
		lastJob = new JobDescription (1, 1, "Este es el �ltimo");
	}

	@BeforeEach
	void setUp() {
		this.initializeJobs();
	} 

	private JobScheduler newFifoScheduler() {
		JobScheduler fifoScheduler = new Fifo();
		return fifoScheduler;
	}
	
	private JobScheduler newLifoScheduler() {
		JobScheduler lifoScheduler = new Lifo();
		return lifoScheduler;
	}
	
	private JobScheduler newPriorityScheduler() {
		JobScheduler priorityScheduler = new HighestPriority();
		return priorityScheduler;
	}
	
	private JobScheduler newEffortScheduler() {
		JobScheduler effortScheduler = new MostEffort();
		return effortScheduler;
	}
	
	private void scheduleJobsIn(JobScheduler aJobScheduler) {
		aJobScheduler.schedule(firstJob);
		aJobScheduler.schedule(highestPriorityJob);
		aJobScheduler.schedule(mostEffortJob);
		aJobScheduler.schedule(lastJob);
	}
	
	@Test
	void testSchedule() {
		JobScheduler aScheduler = new HighestPriority();
		aScheduler.schedule(highestPriorityJob);
		assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
	} 
	
	@Test
	void testUnschedule() {
		JobScheduler aScheduler = new HighestPriority();
		this.scheduleJobsIn(aScheduler);
		aScheduler.unschedule(highestPriorityJob);
		assertFalse(aScheduler.getJobs().contains(highestPriorityJob));   	
	}
	
	@Test
	void testNext() {
		JobScheduler scheduler;
		
		scheduler = this.newFifoScheduler();
		this.scheduleJobsIn(scheduler);
		assertEquals(scheduler.next(), firstJob);
		assertEquals(scheduler.getJobs().size(), 3);
		
		scheduler = this.newLifoScheduler();
		this.scheduleJobsIn(scheduler);
		assertEquals(scheduler.next(), lastJob);
		assertEquals(scheduler.getJobs().size(), 3);
	
		scheduler = this.newPriorityScheduler();
		this.scheduleJobsIn(scheduler);
		assertEquals(scheduler.next(), highestPriorityJob);
		assertEquals(scheduler.getJobs().size(), 3);
	
		scheduler = this.newEffortScheduler();
		this.scheduleJobsIn(scheduler);
		assertEquals(scheduler.next(), mostEffortJob);
		assertEquals(scheduler.getJobs().size(), 3);
	
	}
}
