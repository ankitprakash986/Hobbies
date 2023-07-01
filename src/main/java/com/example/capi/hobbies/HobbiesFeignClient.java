package com.example.capi.hobbies;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="hobbies-feign-client",url = "https://localhost:8082")
public interface HobbiesFeignClient {

}
