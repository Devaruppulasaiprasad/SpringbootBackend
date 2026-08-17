package com.jfs.training.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jfs.training.entity.PatientEntity;


/**
 * PatientDAO is a Spring Data JPA repository interface.
 * 
 * It provides CRUD operations for PatientEntity without requiring any
 * implementation code.
 * 
 * By extending JpaRepository, it inherits many useful methods such as:
 *   - save()
 *   - findById()
 *   - findAll()
 *   - deleteById()
 *   - etc.
 * 
 * This interface will be automatically implemented by Spring Data JPA
 * at runtime.
 */
/**
To-Do Item 1.1:
	Define a JPA repository for fetching to provide built-in CRUD operations without requiring manual implementation.
*/

public interface PatientDAO extends JpaRepository<PatientEntity, Long>{
}