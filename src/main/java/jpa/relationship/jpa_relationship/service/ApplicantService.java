package jpa.relationship.jpa_relationship.service;

import jpa.relationship.jpa_relationship.entity.Applicant;
import jpa.relationship.jpa_relationship.entity.Resume;
import jpa.relationship.jpa_relationship.repository.ApplicantRepo;
import jpa.relationship.jpa_relationship.repository.ResumeRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantService {
    @Autowired
    private ApplicantRepo applicantRepo;

    public Applicant addApplicant(Applicant applicant){
        Resume resume=applicant.getResume();
        if ( resume != null ) {
            resume.setApplicant(applicant);
        }
        return applicantRepo.save(applicant);
    }
}
