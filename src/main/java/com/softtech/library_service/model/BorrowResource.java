package com.softtech.library_service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BorrowResource {

    @Id
    @GeneratedValue
    private long borrowResourceId;

    @OneToOne
    private Student student;

    @OneToOne
    private Staff staff;

    @OneToOne
    private Resource resource;

    private Date borrowedDate;
    private Date returnDate;
    private double charge;
    private boolean isFree;

}
