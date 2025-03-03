package jpa.relationship.jpa_relationship.repository;

import jpa.relationship.jpa_relationship.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ApplicationRepo extends JpaRepository<Application, Long> {
}
