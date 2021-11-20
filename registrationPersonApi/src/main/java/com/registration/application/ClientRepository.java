package com.registration.application;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The Interface ClientRepository.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
