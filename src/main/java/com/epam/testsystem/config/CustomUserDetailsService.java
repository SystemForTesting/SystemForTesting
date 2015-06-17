package com.epam.testsystem.config;

import com.epam.testsystem.model.User;
import com.epam.testsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
//@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).get(0);
        Collection<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(user);

        org.springframework.security.core.userdetails.User userdetails = new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                grantedAuths
        );
        return userdetails;
    }

    private Collection<GrantedAuthority> obtionGrantedAuthorities(User user) {
        Set<GrantedAuthority> authSet = new HashSet<>();
        authSet.add(new SimpleGrantedAuthority("ROLE_" + user.getRoleName().toUpperCase()));
        return authSet;
    }
}
