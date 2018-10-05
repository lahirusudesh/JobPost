package com.testapp4.JobClient.jobTypes;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter // Automatically getter and setter method using Lombok
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class JobType {
    @Id
    @GeneratedValue
    private Integer jobTypeId;
    private @NonNull String jobTitle;
}
