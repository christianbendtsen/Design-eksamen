package com.design.demo.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class BrugerPrincip implements UserDetails {

    private Bruger bruger;

    public BrugerPrincip(Bruger bruger) {
        this.bruger = bruger;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("BRUGER"));
    }

    @Override
    public String getPassword() {
        return bruger.getAdgangskode();
    }

    @Override
    public String getUsername() {
        return bruger.getBrugernavn();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
