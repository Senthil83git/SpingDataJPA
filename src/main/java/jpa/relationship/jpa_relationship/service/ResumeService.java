package jpa.relationship.jpa_relationship.service;

import jpa.relationship.jpa_relationship.entity.Applicant;
import jpa.relationship.jpa_relationship.entity.Resume;
import jpa.relationship.jpa_relationship.repository.ApplicantRepo;
import jpa.relationship.jpa_relationship.repository.ResumeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class ResumeService {

    @Autowired
    private ResumeRepo resumeRepo;

    @Autowired
    private ApplicantRepo applicantRepo;

    public Resume addResume(Long applicantId,Resume resume){
        Optional<Applicant> applicantOptional=applicantRepo.findById(applicantId);
        if(applicantOptional.isPresent()){
            Applicant applicant=applicantOptional.get();
            resume.setApplicant(applicant);
            return resumeRepo.save(resume);
        } else{
            throw new RuntimeException("Applicant not found with Id "+applicantId);
        }
    }
}
