package com.design.demo.Model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fornavn;
    private String efternavn;
    private String title;
    private String intialer;
    private String socialSecurityNumber;
    private String koen;
    private String maritalStatus;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String by;
    private String adresse;
    private String tlf;
    private String mobil;
    private String email;
    private String photo;

}
