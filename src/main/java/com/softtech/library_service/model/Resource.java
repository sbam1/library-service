package com.softtech.library_service.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Resource implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "resource_id")
    private long resourceId;
    private String title;
    private String subject;
    private String barcode;
    private String writer;
    private Date publishedDate;
}
