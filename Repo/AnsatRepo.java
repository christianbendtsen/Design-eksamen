package com.design.demo.Repo;

import com.design.demo.Model.Ansat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnsatRepo extends JpaRepository <Ansat, Integer> {

    public Ansat findByBrugernavn(String un);
}
