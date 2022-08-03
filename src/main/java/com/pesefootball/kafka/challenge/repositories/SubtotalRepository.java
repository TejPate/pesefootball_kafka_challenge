package com.pesefootball.kafka.challenge.repositories;

import com.pesefootball.kafka.challenge.entities.SubTotalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubtotalRepository extends JpaRepository<SubTotalEntity, String> {
}
