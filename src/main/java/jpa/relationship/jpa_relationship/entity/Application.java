package jpa.relationship.jpa_relationship.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String status;
    private String position;

    @ManyToOne
    @JoinColumn(name="applicantId",nullable = false)
    @JsonIgnore
    private Applicant applicant;
}
