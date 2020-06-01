package com.design.demo.Repo;

import com.design.demo.Model.AnsatteType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnsatteTypeRepo extends JpaRepository <AnsatteType, Integer> {
}
