package com.epam.testsystem.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private boolean deleted;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
