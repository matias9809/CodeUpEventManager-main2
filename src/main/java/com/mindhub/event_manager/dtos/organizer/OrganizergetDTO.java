package com.mindhub.event_manager.dtos.organizer;


import com.mindhub.event_manager.dtos.event.EventDetailDTO;
import com.mindhub.event_manager.enums.CustomerRol;
import com.mindhub.event_manager.models.Organizer;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
public class OrganizergetDTO {
    private UUID id;
    private String name;
    private String lastname;
    private String email;
    private CustomerRol rol;
    private List<EventDetailDTO> listEvent;


    public OrganizergetDTO(Organizer organizer){
        this.id=organizer.getId();
        this.email= organizer.getEmail();
        this.name= organizer.getName();
        this.lastname= organizer.getName();
        this.rol=organizer.getRol();
        this.listEvent=organizer.getEvents().stream().map(EventDetailDTO::new).collect(Collectors.toList());
    }

}
