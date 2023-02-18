package com.ltp.gradesubmission.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity   //Entity field maps to table column  @column maps to column
@Table(name="student")

//NO-CODE GETTERS AND SEETTERS AND CONSTRUCTORS
@Getter
@Setter
//only update n.o of fieds using constructor so sue required arg constructor
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

    //relation between 1 student and many grade
    @JsonIgnore
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL) //cascade if any item is deleted it shuld be reflected to relation also
    private List<Grade> grades;


}
