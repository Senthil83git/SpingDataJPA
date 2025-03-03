package jpa.relationship.jpa_relationship.controller;

import jpa.relationship.jpa_relationship.entity.Applicant;
import jpa.relationship.jpa_relationship.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @PostMapping("/add")
    public ResponseEntity<Applicant> addApplicant(@RequestBody Applicant applicant){
        return ResponseEntity.ok(applicantService.addApplicant(applicant));
    }
}
