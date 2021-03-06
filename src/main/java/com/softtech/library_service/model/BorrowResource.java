package com.softtech.library_service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BorrowResource implements Serializable {
    private static final long serialVersionUID = 1L;

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
