package io.github.vikie1.restservice.progress.current;

import org.springframework.data.repository.CrudRepository;

/**
 * JobRepository
 */
public interface JobRepository extends CrudRepository<CurrentJob, String>{}
