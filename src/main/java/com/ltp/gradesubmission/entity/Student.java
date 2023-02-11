package com.ltp.gradesubmission.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Entity   //Entity field maps to table column  @column maps to column
@Table(name="student")

//NO-CODE GETTERS AND SEETTERS AND CONSTRUCTORS
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id //primarykey
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" ,nullable=false)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="birth_date", nullable = false)
    private LocalDate birthDate;


}
