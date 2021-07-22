package com.example.spring.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

public interface SpeakerRepository extends CrudRepository<Speaker, Long> {

    @RestResource(path = "by-twitter")
    Speaker findByTwitter(@Param("id")String twitter);

    Collection<Speaker> findByFirstName(@Param("name") String firstName);
}
