package com.hugo.cardapio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hugo.cardapio.repositories.UserRepository;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    UserRepository repository;

    @Override
    //Local onde o SpringSecurity consulta a base de dados utilizada para a autenticação
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }
    
}
