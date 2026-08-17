package com.jfs.training.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jfs.training.entity.AppointmentEntity;


/**
 * AppointmentDAO is a Spring Data JPA repository interface.
 * It provides CRUD operations for AppointmentEntity without requiring
 * any boilerplate code.
 *
 * By extending JpaRepository, it inherits methods such as:
 * - save()
 * - findById()
 * - findAll()
 * - deleteById()
 * - etc.
 */
/**
To-Do Item 1.2:
	Define a JPA repository for fetching to provide built-in CRUD operations without requiring manual implementation.
*/
public interface AppointmentDAO extends JpaRepository<AppointmentEntity, Long>{
}