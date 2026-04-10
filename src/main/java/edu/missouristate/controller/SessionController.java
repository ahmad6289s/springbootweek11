package edu.missouristate.controller;

import edu.missouristate.model.Sessions;
import edu.missouristate.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/sessions")
    public String getSessions(Model model) {
        model.addAttribute("sessions", sessionService.findAllSessions());
        return "sessions";
    }

    @GetMapping("/sessions/add")
    public String getAddSession(Model model) {
        model.addAttribute("sessions", new Sessions());
        return "add-session";
    }

    @PostMapping("/sessions/save")
    public String saveSession(Sessions listOfSessions) {
        sessionService.saveSession(listOfSessions);
        return "redirect:/sessions";
    }

    @GetMapping("/sessions/edit/{id}")
    public String getEditSession(@PathVariable Long id, Model model) {
        model.addAttribute("sessions", sessionService.findSessionById(id));
        return "edit-session";
    }

    @PostMapping("/sessions/update")
    public String updateSession(Sessions updateSessions) {
        sessionService.saveSession(updateSessions);
        return "redirect:/sessions";
    }

    @GetMapping("/sessions/delete/{id}")
    public String deleteSession(@PathVariable Long id) {
        sessionService.deleteSessionById(id);
        return "redirect:/sessions";
    }
}