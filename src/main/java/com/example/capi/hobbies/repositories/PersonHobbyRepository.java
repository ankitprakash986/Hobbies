package com.example.capi.hobbies.repositories;

import com.example.capi.hobbies.entities.Hobbies;
import com.example.capi.hobbies.entities.PersonHobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonHobbyRepository extends JpaRepository<PersonHobby,Long> {
    public List<PersonHobby> getPersonHobbyByPersonId(Long personId);

    public List<PersonHobby> getAllByPersonIdIn(List<Long> ids);

}
