package com.example.capi.hobbies.controller;

import com.example.capi.hobbies.dto.HobbiesDTO;
import com.example.capi.hobbies.dto.PersonHobbiesResponse;
import com.example.capi.hobbies.entities.Hobbies;
import com.example.capi.hobbies.entities.PersonHobby;
import com.example.capi.hobbies.services.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbiesController {

    @Autowired
    public HobbiesService hobbiesService;
    @GetMapping("/ping")
    public ResponseEntity<String> ping (){
        return ResponseEntity.ok("I m Working.");
    }

    @GetMapping("/hobby/{personId}")
    public ResponseEntity<PersonHobbiesResponse> fetchHobbiesByPersonId(@PathVariable String personId){
        return ResponseEntity.ok(hobbiesService.fetchHobbiesByPersonId(Long.parseLong(personId)));
    }

    @GetMapping("hobbies/{personIds}")
    public ResponseEntity<List<HobbiesDTO>> fetchAllHobbiesByPersonIds(@PathVariable List<Long> personIds){
        return ResponseEntity.ok(hobbiesService.fetchAllHobbiesByPersonIds(personIds));
    }


}
