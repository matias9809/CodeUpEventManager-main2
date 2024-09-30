package com.mindhub.event_manager.dtos.reaction;

import com.mindhub.event_manager.enums.ReactionType;
import com.mindhub.event_manager.models.Reaction;
import com.mindhub.event_manager.models.ReactionId;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReactionSummaryDTO {
    private ReactionId id;
    private ReactionType reactionType;

    public ReactionSummaryDTO(Reaction reaction){
        this.id = reaction.getId();
        this.reactionType = reaction.getReactionType();
    }
}
