package com.infoway.petclinic.web;


	import java.util.List;
	import java.util.Optional;

	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseStatus;
	import org.springframework.web.bind.annotation.RestController;

import com.infoway.petclinic.dao.VisitRepository;
import com.infoway.petclinic.model.Visit;

	@RequestMapping("/visit")
	@RestController
	public class VisitResources {
		@Autowired
		VisitRepository visitRepository;
		
		
		@PostMapping
	    @ResponseStatus//(HttpStatus.CREATED)
	    public Visit createOwner(@Valid @RequestBody Visit owner) {
		return visitRepository.save(owner);
	    }
		
		 @GetMapping(value = "/{visitId}")
	     public Optional<Visit> findOwner(@PathVariable("visitId") int visitId) {
	         return visitRepository.findById(visitId);
	     }
		 
		 @GetMapping
			public List<Visit> findAll() {
				return visitRepository.findAll();
			}
		 
		 
		
		
		
	}
