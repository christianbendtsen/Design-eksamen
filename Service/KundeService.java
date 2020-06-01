package com.design.demo.Service;

import com.design.demo.Model.Kunde;
import com.design.demo.Repo.KundeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KundeService {

    @Autowired
    private KundeRepo kundeRepo;

    //Retunere liste af kunder
    public List<Kunde> getKunder(){
        return kundeRepo.findAll();
    }

    //Gem ny kunde
    public void save(Kunde kunde){
        kundeRepo.save(kunde);
    }

    //Get by id
    public Optional<Kunde> findById(int id){
        return kundeRepo.findById(id);
    }

    //Slet kunde
    public void delete(Integer id){
        kundeRepo.deleteById(id);
    }
}
