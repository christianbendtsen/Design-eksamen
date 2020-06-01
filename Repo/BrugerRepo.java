package com.design.demo.Repo;

import com.design.demo.Model.Bruger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BrugerRepo extends JpaRepository<Bruger, Integer> {
    Bruger findByBrugernavn(String brugernavn);
}
