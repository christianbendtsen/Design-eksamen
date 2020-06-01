package com.design.demo.Service;

import com.design.demo.Model.AnsatteType;
import com.design.demo.Repo.AnsatteTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnsatteTypeService {

    @Autowired
    private AnsatteTypeRepo ansatteTypeRepo;

    //Retuner liste af ansatte
    public List<AnsatteType> getAnsatteType(){
        return ansatteTypeRepo.findAll();
    }

    //Gem ny ansat
    public void save(AnsatteType ansatteType){
        ansatteTypeRepo.save(ansatteType);
    }

    //get by id
    public Optional<AnsatteType> findById(int id){
        return ansatteTypeRepo.findById(id);
    }

    public void delete(Integer id){
        ansatteTypeRepo.deleteById(id);
    }
}
