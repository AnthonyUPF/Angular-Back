package com.ironhack.demosecurityjwt.models.SchoolClassModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schoolClassId;
    private String title;
    private String description;

    public SchoolClass(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
