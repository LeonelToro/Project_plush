package com.codingdojo.leonel.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.leonel.models.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,Long> {
	Organization findByEmail(String email);
}
