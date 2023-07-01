package com.example.capi.hobbies.dto;

import lombok.Data;

import java.util.List;
@Data
public class PersonHobbiesResponse {
    Long personId;
    List<HobbiesDTO> hobbies;
}
