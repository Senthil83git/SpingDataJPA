package jpa.relationship.jpa_relationship.controller;


import jpa.relationship.jpa_relationship.entity.Application;
import jpa.relationship.jpa_relationship.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/{applicantId}/add")
    public ResponseEntity<Application> addApplication(@PathVariable Long applicantId, @RequestBody Application application){
        return  ResponseEntity.ok(applicationService.saveApplication(applicantId, application));
    }

}
