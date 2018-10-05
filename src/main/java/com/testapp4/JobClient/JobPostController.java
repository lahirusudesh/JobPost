package com.testapp4.JobClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class JobPostController {
    @Autowired
    private final JobPostRepository jobPostRepository;
    public JobPostController(JobPostRepository jobPostRepository){
        this.jobPostRepository=jobPostRepository;
    }


    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public JobPost create(@RequestBody JobPost jobpost){
        return jobPostRepository.save(jobpost);
    }

    @GetMapping(path = "/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public @ResponseBody Iterable<JobPost> getAllJobPosts() {
        return jobPostRepository.findAll();
    }

    @PutMapping("/all/{id}")
    public ResponseEntity<Object> updateJobPost(@RequestBody JobPost jobPost, @PathVariable long id) {
        Optional<JobPost> jobPostOptional = jobPostRepository.findById(id);
        if (!jobPostOptional.isPresent())
            return ResponseEntity.notFound().build();
        jobPost.setId(id);
        jobPostRepository.save(jobPost);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("all/jobs/user/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public @ResponseBody Iterable<JobPost> getAllPostedJobs( @PathVariable int id) {
        return jobPostRepository.findByEmployerId(id);
    }

}
