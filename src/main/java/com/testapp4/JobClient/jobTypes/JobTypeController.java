package com.testapp4.JobClient.jobTypes;

import com.testapp4.JobClient.JobPost;
import com.testapp4.JobClient.jobTypes.JobTypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JobTypeController {
    private JobTypeRepository jobTypeRepository;
    public JobTypeController(JobTypeRepository jobTypeRepository){
        this.jobTypeRepository=jobTypeRepository;
    }

    @GetMapping(path = "/allJobTypes")
    @CrossOrigin(origins = "http://localhost:4200")
    public @ResponseBody Iterable<JobType> getAllJobPosts() {

        return jobTypeRepository.findAll();
    }
}
