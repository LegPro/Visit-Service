package com.infoway.petclinic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoway.petclinic.model.Visit;

public interface VisitRepository extends JpaRepository<Visit, Integer> {

}
