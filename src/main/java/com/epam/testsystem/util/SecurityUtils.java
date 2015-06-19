package com.epam.testsystem.util;

import com.epam.testsystem.security.AuthenticatedUser;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityUtils {
    public static AuthenticatedUser getCurrentlyAuthenticatedUser() {
        return (AuthenticatedUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
