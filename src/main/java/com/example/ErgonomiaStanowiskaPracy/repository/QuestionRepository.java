package com.example.ErgonomiaStanowiskaPracy.repository;

import com.example.ErgonomiaStanowiskaPracy.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionDB, Long> {

}
