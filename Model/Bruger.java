package com.design.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bruger {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String fornavn;
    private String efternavn;
    private String brugernavn;
    private String adgangskode;
}
