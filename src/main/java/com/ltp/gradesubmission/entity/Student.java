package com.ltp.gradesubmission.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Entity   //Entity field maps to table column  @column maps to column
@Table(name="student")
@Getter
@Setter
public class Student {
    @Id //primarykey
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" ,nullable=false)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="birth_date", nullable = false)
    private LocalDate birthDate;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
