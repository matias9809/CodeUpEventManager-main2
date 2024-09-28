package com.mindhub.event_manager.repositories;
import com.mindhub.event_manager.models.Reaction;
import com.mindhub.event_manager.models.ReactionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction, ReactionId> {
}
