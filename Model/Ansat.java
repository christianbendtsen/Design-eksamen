package com.design.demo.Model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Ansat extends Person {

    //@ManyToOne
    //@JoinColumn (name = "ansattetypeid", insertable = false, updatable = false)
    //private AnsatteType ansatteType;
    //private Integer ansattetypeid;

    private String photo;
    private String brugernavn;

    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date ansaettelsesDato;






}
