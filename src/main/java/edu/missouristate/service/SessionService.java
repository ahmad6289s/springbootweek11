package edu.missouristate.service;

import edu.missouristate.model.Sessions;
import edu.missouristate.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public Iterable<Sessions> findAllSessions() {
        return sessionRepository.findAll();
    }

    public void saveSession(Sessions sessions) {
        sessionRepository.save(sessions);
    }

    public Sessions findSessionById(Long id) {
        return sessionRepository.findById(id).orElse(null);
    }

    public void deleteSessionById(Long id) {
        sessionRepository.deleteById(id);
    }
}