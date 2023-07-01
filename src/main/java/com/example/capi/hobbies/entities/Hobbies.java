package com.example.capi.hobbies.entities;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Hobbies implements Serializable {

    @Id
    @Column(name = "hobby_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long hobbyId;
    String name;
    String type;
    String description;
}

