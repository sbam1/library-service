package com.softtech.library_service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ReturnResource implements Serializable {

    @Id
    @GeneratedValue
    private long returnId;
    private Date returnDate;
    private double lateFee;

    @OneToOne
    private BorrowResource borrowResource;
}
