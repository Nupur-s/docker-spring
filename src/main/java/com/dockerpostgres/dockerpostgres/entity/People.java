package com.dockerpostgres.dockerpostgres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class People {

    @Id
    private int id;
    private String fname;
    private String lname;

}
