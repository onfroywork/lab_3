package com.example.jobapptutorial.job;

import java.util.List;

/**
 * Інтерфейс сервісного рівня: описує бізнес-логіку роботи з вакансіями.
 */
public interface IJobService {

    List<Job> findAll();

    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
