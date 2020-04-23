package com.softtech.library_service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Staff implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long staffId;
    private String firstName;
    private String lastName;
    private String address;
    private String position;
    private double salary;

}
