package com.mindhub.event_manager.dtos.event;

import com.mindhub.event_manager.dtos.comment.CommentSummaryDTO;
import com.mindhub.event_manager.dtos.location.LocationSummaryDTO;
import com.mindhub.event_manager.dtos.organizer.OrganizerSummaryDTO;
import com.mindhub.event_manager.dtos.reaction.ReactionSummaryDTO;
import com.mindhub.event_manager.models.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class EventDetailDTO {

    private UUID id;
    private String name;
    private byte age_req;
    private String desc;
    private String img;
    private OrganizerSummaryDTO organizer;
    private Set<LocationSummaryDTO> locations = new HashSet<>();
    private Set<CommentSummaryDTO> comments = new HashSet<>();
    private Set<ReactionSummaryDTO> reactions = new HashSet<>();

    public EventDetailDTO(Event event){
        this.id = event.getId();
        this.name = event.getName();
        this.age_req = event.getAge_req();
        this.desc = event.getDesc();
        this.img = event.getImg();
        this.organizer = new OrganizerSummaryDTO(event.getOrganizer());
        this.comments = event.getComments().stream().map(CommentSummaryDTO::new).collect(Collectors.toSet());
        this.locations = event.getEventLocations().stream().map(el -> new LocationSummaryDTO(el.getLocation())).collect(Collectors.toSet());
        this.reactions = event.getReactions().stream().map(ReactionSummaryDTO::new).collect(Collectors.toSet());
    }
}
