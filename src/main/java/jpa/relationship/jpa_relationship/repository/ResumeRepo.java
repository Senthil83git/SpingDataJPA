package jpa.relationship.jpa_relationship.repository;

import jpa.relationship.jpa_relationship.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepo extends JpaRepository<Resume, Long> {
}
