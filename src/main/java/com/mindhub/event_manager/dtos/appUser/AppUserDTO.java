package com.mindhub.event_manager.dtos.appUser;

import com.mindhub.event_manager.dtos.comment.CommentSummaryDTO;
import com.mindhub.event_manager.dtos.reaction.ReactionSummaryDTO;
import com.mindhub.event_manager.enums.CustomerGender;
import com.mindhub.event_manager.enums.CustomerRol;
import com.mindhub.event_manager.models.*;
import lombok.Getter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
@Getter
public class AppUserDTO {
    private UUID id;
    private String name;
    private String lastname;
    private String email;
    private byte age;
    private CustomerGender gender;


    public AppUserDTO(AppUser appUser){
        this.id=appUser.getId();
        this.email= appUser.getEmail();
        this.name= appUser.getName();
        this.lastname= appUser.getName();
        this.age=appUser.getAge();
        this.gender=appUser.getGender();
    }
}
