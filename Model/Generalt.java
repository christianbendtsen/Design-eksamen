package com.design.demo.Model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class Generalt {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String beskrivelse;
    private String detaljer;


    public Generalt() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getDetaljer() {
        return detaljer;
    }

    public void setDetaljer(String detaljer) {
        this.detaljer = detaljer;
    }

    @Override
    public String toString() {
        return "Generalt{" +
                "id=" + id +
                ", beskrivelse='" + beskrivelse + '\'' +
                ", detaljer='" + detaljer + '\'' +
                '}';
    }
}
