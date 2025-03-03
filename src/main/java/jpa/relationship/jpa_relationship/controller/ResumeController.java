package jpa.relationship.jpa_relationship.controller;


import jpa.relationship.jpa_relationship.entity.Resume;
import jpa.relationship.jpa_relationship.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @PostMapping("/{applicantId}/add")
    public ResponseEntity<Resume> addResume(@PathVariable Long applicantId, @RequestBody Resume resume){
        return ResponseEntity.ok(resumeService.addResume(applicantId,resume));
    }
}
