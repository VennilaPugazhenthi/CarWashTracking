package com.vanavil.CarWashTracking.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@CompoundIndex(def = "{'first_name':1, 'last_name': 1, 'phone_no':1}",unique = true)
@Document(collection = "User")
public class User {
    @Id
    private String user_id;

    private String first_name;
    private String last_name;
    private String phone_no;
    private String email;
    private List<String> plate_no;
    private Address address;
    private LocalDateTime created;

    public User(String first_name, String last_name, String phone_no, String email, List<String> plate_no, Address address, LocalDateTime created) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_no = phone_no;
        this.email = email;
        this.plate_no = plate_no;
        this.address = address;
        this.created = created;
    }
}
