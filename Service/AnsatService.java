package com.design.demo.Service;

import com.design.demo.Model.Ansat;
import com.design.demo.Repo.AnsatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnsatService {

    @Autowired
    private AnsatRepo ansatRepo;

    //Retuner liste af ansatte
    public List<Ansat> getAnsatte(){
        return ansatRepo.findAll();
    }

    //Gem ny ansat
    public void save(Ansat ansat){
        ansatRepo.save(ansat);
    }

    //get by id
    public Optional<Ansat> findById(int id){
        return ansatRepo.findById(id);
    }

    public void delete(Integer id){
        ansatRepo.deleteById(id);
    }
}
