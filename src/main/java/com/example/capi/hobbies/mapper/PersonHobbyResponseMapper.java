package com.example.capi.hobbies.mapper;

import com.example.capi.hobbies.dto.HobbiesDTO;
import com.example.capi.hobbies.entities.Hobbies;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonHobbyResponseMapper {

    public HobbiesDTO personHobbyResponseMapper(Hobbies hobby){
        HobbiesDTO hobbyDTO = new HobbiesDTO();
        hobbyDTO.setName(hobby.getName());
        hobbyDTO.setHobbyId(hobby.getHobbyId());
        hobbyDTO.setDescription(hobbyDTO.getDescription());
        hobbyDTO.setType(hobbyDTO.getType());

        return hobbyDTO;
    }

    public List<HobbiesDTO> convert(List<Hobbies> hobbies){
        List<HobbiesDTO> hobbiesDTOS = new ArrayList<>();
        for(Hobbies hobby:hobbies){
            HobbiesDTO hobbiesDTO = new HobbiesDTO();
            hobbiesDTO.setHobbyId(hobby.getHobbyId());
            hobbiesDTO.setName(hobby.getName());
            hobbiesDTO.setType(hobby.getType());
            hobbiesDTO.setDescription(hobby.getDescription());

            hobbiesDTOS.add(hobbiesDTO);
        }

        return hobbiesDTOS;
    }

}
