package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

// Long for Primary Key
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
