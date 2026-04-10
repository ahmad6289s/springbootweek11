package edu.missouristate.repository;

import edu.missouristate.model.Sessions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<Sessions, Long> {
}