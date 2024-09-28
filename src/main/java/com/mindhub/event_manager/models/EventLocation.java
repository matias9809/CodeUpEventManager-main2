package com.mindhub.event_manager.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class EventLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private UUID id;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;
    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;

    @OneToMany(mappedBy = "eventLocation")
    private Set<CustomerEventLocation> customerEventLocations = new HashSet<>();

    private LocalDateTime date;
    private int assistance;

    public void addCustomerEvent(CustomerEventLocation customerEventLocation){
        customerEventLocation.setEventLocation(this);
        this.customerEventLocations.add(customerEventLocation);
    }

}
