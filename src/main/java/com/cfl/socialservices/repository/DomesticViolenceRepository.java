package com.cfl.socialservices.repository;

import com.cfl.socialservices.domain.DomesticViolence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomesticViolenceRepository extends CrudRepository<DomesticViolence, Integer> {
     DomesticViolence findByStudentId(Integer studentId);
}
