package com.shubhamssd.E_Learning_Platform.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

//@Getter
//@Setter
//@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity {


    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;

    @Column(
            name = "l_name",
            length = 35
    )
    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private int age;

    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;


    @Column(
            insertable = false
    )
    private LocalDateTime modified;

    @ManyToMany
            (
                    mappedBy = "authors"
            )
    private List<Course> courses;
}



