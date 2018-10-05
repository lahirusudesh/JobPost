package com.testapp4.JobClient;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // Says that this is the Entity

@Getter // Automatically getter and setter method using Lombok
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class JobPost {
    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String title;
    private String description;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private Boolean isPublished=false;
    private Integer employerId=1;
}
