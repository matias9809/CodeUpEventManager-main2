package com.mindhub.event_manager.dtos.organizer;

import com.mindhub.event_manager.models.Organizer;
import lombok.Getter;

import java.util.UUID;
@Getter
public class OrganizerSummaryDTO {
    private UUID id;
    private String name;
    private String lastname;
    private String email;

    public OrganizerSummaryDTO(Organizer organizer){
        this.id = organizer.getId();
        this.name = organizer.getName();
        this.lastname = organizer.getLastname();
        this.email = organizer.getEmail();
    }
}
