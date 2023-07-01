package com.example.capi.hobbies.services;

import com.example.capi.hobbies.dto.HobbiesDTO;
import com.example.capi.hobbies.dto.PersonHobbiesResponse;
import com.example.capi.hobbies.entities.Hobbies;
import com.example.capi.hobbies.entities.PersonHobby;
import com.example.capi.hobbies.mapper.PersonHobbyResponseMapper;
import com.example.capi.hobbies.repositories.HobbyRepository;
import com.example.capi.hobbies.repositories.PersonHobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HobbiesServiceImpl implements HobbiesService {
    @Autowired
    public PersonHobbyRepository personHobbyRepository;

    @Autowired
    private HobbyRepository hobbyRepository;

    @Autowired
    private PersonHobbyResponseMapper personHobbyResponseMapper;

    @Override
    public PersonHobbiesResponse fetchHobbiesByPersonId(Long personId) {

        List<PersonHobby> personHobbies = personHobbyRepository.getPersonHobbyByPersonId(personId);
        PersonHobbiesResponse personHobbiesResponse = new PersonHobbiesResponse();
//        List<Hobbies> hobbies = new ArrayList<>();
//        for(PersonHobby personHobby : personHobbies ){
//            Long hobbyId = personHobby.getHobbyId();
//            hobbies.add(hobbyRepository.getHobbiesByHobbyId(hobbyId));
//        }
//        personHobbiesResponse.setJobs(hobbies);

        personHobbiesResponse.setPersonId(personHobbies.get(0).getPersonId());

        List<HobbiesDTO> hobbiesDTOS = new ArrayList<>();
//        for(PersonHobby personHobby : personHobbies ){
//           Long hobbyId = personHobby.getHobbyId();
//           Hobbies hobby = hobbyRepository.getHobbiesByHobbyId(hobbyId);
//           HobbiesDTO hobbyDTO = personHobbyResponseMapper.personHobbyResponseMapper(hobby);
//           hobbiesDTOS.add(hobbyDTO);
//        }

        List<Long> hobbyIds = new ArrayList<>();

        for(PersonHobby personHobby:personHobbies){
            hobbyIds.add(personHobby.getHobbyId());
        }

       List<Hobbies> hobbies = hobbyRepository.getAllByHobbyIdIn(hobbyIds);

        hobbiesDTOS = personHobbyResponseMapper.convert(hobbies);

        personHobbiesResponse.setHobbies(hobbiesDTOS);

        return  personHobbiesResponse;
    }

    @Override
    public  List<HobbiesDTO> fetchAllHobbiesByPersonIds(List<Long> personIds){

        List<PersonHobby> personHobbies = personHobbyRepository.getAllByPersonIdIn(personIds);
//        PersonHobbiesResponse personHobbiesResponse = new PersonHobbiesResponse();

//        personHobbiesResponse.setPersonId(personHobbies.get(0).getPersonId());

        List<HobbiesDTO> hobbiesDTOS = new ArrayList<>();

        List<Long> hobbyIds = new ArrayList<>();

        for(PersonHobby personHobby:personHobbies){
            hobbyIds.add(personHobby.getHobbyId());
        }

        List<Hobbies> hobbies = hobbyRepository.getAllByHobbyIdIn(hobbyIds);

        hobbiesDTOS = personHobbyResponseMapper.convert(hobbies);

//        personHobbiesResponse.setHobbies(hobbiesDTOS);

        return  hobbiesDTOS;


    }

}
