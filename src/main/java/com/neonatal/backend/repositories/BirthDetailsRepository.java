package com.neonatal.backend.repositories;

import com.neonatal.backend.entities.Birth_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

/**
 * This interface functions as the class for CRUD operations
 * on the Birth_Details table with ID type of Long.
 */
@Repository
public interface BirthDetailsRepository extends JpaRepository<Birth_Details, Long> {
}
