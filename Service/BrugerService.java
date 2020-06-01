package com.design.demo.Service;

import com.design.demo.Model.Bruger;
import com.design.demo.Repo.BrugerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrugerService {

    @Autowired
    private BrugerRepo brugerRepo;

    public void save(Bruger bruger){
        brugerRepo.save(bruger);
    }
}
