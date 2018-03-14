/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package com.montealegreluis.facebooklogin.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UsersController {
    @GetMapping("/user")
    public Principal user(Principal principal) {
//        OAuth2Authentication user = (OAuth2Authentication) principal;
//        OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) user.getDetails();
        return principal;
    }
}
