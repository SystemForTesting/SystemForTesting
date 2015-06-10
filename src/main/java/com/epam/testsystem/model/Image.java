package com.epam.testsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class Image extends BaseEntity {
    private String caption;

    @Lob
    @Column(nullable=false, columnDefinition="mediumblob")
    private byte[] image;

}
