package com.sampleapp.sampleappdemo.repository;

import com.sampleapp.sampleappdemo.modles.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
