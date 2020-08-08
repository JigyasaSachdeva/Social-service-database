package com.cfl.socialservices.repository;

import com.cfl.socialservices.domain.MentalHealth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentalHealthRepository extends CrudRepository<MentalHealth, Integer> {
    MentalHealth findByStudentId(Integer studentId);
}
