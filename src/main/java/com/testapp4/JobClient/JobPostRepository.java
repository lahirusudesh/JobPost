package com.testapp4.JobClient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
interface JobPostRepository extends JpaRepository<JobPost,Long> {
    List<JobPost> findByEmployerId(Integer employerId);
}
