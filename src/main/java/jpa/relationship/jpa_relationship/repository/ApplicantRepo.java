package jpa.relationship.jpa_relationship.repository;

import jpa.relationship.jpa_relationship.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepo extends JpaRepository<Applicant, Long> {
}
