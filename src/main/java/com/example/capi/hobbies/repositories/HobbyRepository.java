package com.example.capi.hobbies.repositories;

import com.example.capi.hobbies.entities.Hobbies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HobbyRepository extends JpaRepository<Hobbies , Long> {
    public Hobbies getHobbiesByHobbyId(Long hobbyId);

    public List<Hobbies> getAllByHobbyIdIn(List<Long> ids);
}
