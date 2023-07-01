package com.example.capi.hobbies.entities;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="person_hobby")
public class PersonHobby implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "person_id")
    Long personId;

//    @OneToOne()
//    @JoinColumn(name = "hobby_id", referencedColumnName = "hobby_id")
//    Hobbies hobbies;
    @Column(name = "hobby_id")
    Long hobbyId;

}
