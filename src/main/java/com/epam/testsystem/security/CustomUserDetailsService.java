package com.epam.testsystem.security;

import com.epam.testsystem.dao.DaoFactory;
import com.epam.testsystem.dao.UserDao;
import com.epam.testsystem.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getUserDao().findByName(username);
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

    private UserDao getUserDao() {
        return DaoFactory.getInstance().getDao(User.class);
    }
}
