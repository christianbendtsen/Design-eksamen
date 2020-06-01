package com.design.demo.Repo;

import com.design.demo.Model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundeRepo extends JpaRepository <Kunde, Integer> {
}
