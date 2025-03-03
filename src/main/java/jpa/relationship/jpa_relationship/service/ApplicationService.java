package jpa.relationship.jpa_relationship.service;


import jpa.relationship.jpa_relationship.entity.Applicant;
import jpa.relationship.jpa_relationship.entity.Application;
import jpa.relationship.jpa_relationship.repository.ApplicantRepo;
import jpa.relationship.jpa_relationship.repository.ApplicationRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationService {

    @Autowired
    private ApplicationRepo applicationRepo;

    @Autowired
    private ApplicantRepo applicantRepo;

    public Application saveApplication(Long applicantId,Application application){
        Optional<Applicant> applicantOptional=applicantRepo.findById(applicantId);
        if(applicantOptional.isPresent()){
            Applicant applicant=applicantOptional.get();
            application.setApplicant(applicant);
            return applicationRepo.save(application);
        } else{
            throw new RuntimeException("Applicant not found with Id "+applicantId);
        }

    }
}
