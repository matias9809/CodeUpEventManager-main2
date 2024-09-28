package com.mindhub.event_manager.controllers;

import com.mindhub.event_manager.dtos.event.EventDTO;
import com.mindhub.event_manager.dtos.organizer.OrganizergetDTO;
import com.mindhub.event_manager.models.Customer;
import com.mindhub.event_manager.models.Organizer;
import com.mindhub.event_manager.repositories.EventRepository;
import com.mindhub.event_manager.repositories.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/api/organizer")
public class OrganizerController {

    @Autowired
    private OrganizerRepository organizerRepository;

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public ResponseEntity<List<OrganizergetDTO>> getListDTO(){
        List<OrganizergetDTO> list=(organizerRepository.findAll().stream().filter(Customer::isActivated).map(OrganizergetDTO::new).toList());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<OrganizergetDTO> getListDTO(@PathVariable UUID id){
        return new ResponseEntity<>(new OrganizergetDTO(organizerRepository.findById(id).orElse(null)), HttpStatus.OK);
    }

}
