package com.design.demo.Service;

import com.design.demo.Model.Bruger;
import com.design.demo.Model.BrugerPrincip;
import com.design.demo.Repo.BrugerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;

@Service
public class BrugerDetaljerService implements UserDetailsService {

    @Autowired
    BrugerRepo brugerRepo;


    @Override
    public UserDetails loadUserByUsername(String brugernavn) throws UsernameNotFoundException {
        Bruger bruger = brugerRepo.findByBrugernavn(brugernavn);

        if (bruger == null){
            throw new UsernameNotFoundException("Bruger ikke fundet");
        }


        return new BrugerPrincip(bruger);
    }
}
