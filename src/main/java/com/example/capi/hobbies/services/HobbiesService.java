package com.example.capi.hobbies.services;

import com.example.capi.hobbies.dto.HobbiesDTO;
import com.example.capi.hobbies.dto.PersonHobbiesResponse;
import com.example.capi.hobbies.entities.Hobbies;
import com.example.capi.hobbies.entities.PersonHobby;

import java.util.List;

public interface HobbiesService {
    PersonHobbiesResponse fetchHobbiesByPersonId(Long personId);
    List<HobbiesDTO> fetchAllHobbiesByPersonIds(List<Long> personIds);
}
