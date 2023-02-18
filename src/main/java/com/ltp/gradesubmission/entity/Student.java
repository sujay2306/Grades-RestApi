package com.ltp.gradesubmission.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity   //Entity field maps to table column  @column maps to column
@Table(name="student")

//NO-CODE GETTERS AND SEETTERS AND CONSTRUCTORS
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {
    @Id //primarykey
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" ,nullable=false)
    private Long id;

    @NonNull
    @Column(name="name", nullable = false)
    private String name;

    @NonNull
    @Column(name="birth_date", nullable = false)
    private LocalDate birthDate;

    @OneToMany(mappedBy = "student")
    private List<Grade> grades;


}
