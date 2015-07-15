package com.epam.testsystem.rest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserTestController {
    private List<User> users = new ArrayList<>();

    private User getUserByName(String name){
        for (User user : users) {
            if (user.getName().toLowerCase().equals(name.toLowerCase()))
                return user;
        }
        return null;
    }

    @RequestMapping(value = "/{name}.rest", method = RequestMethod.GET, headers = "Accept=application/json")
    public @ResponseBody User getUser(@PathVariable String name, ModelMap model) {
        if (users.isEmpty()){
            users.add(new User("John", "Smith"));
            users.add(new User("Marcus", "Gray"));
            users.add(new User("Son", "Stevens"));
            users.add(new User("James", "Raygan"));
        }

//        User user = getUserByName(name);
//        model.addAttribute("user", user);
        return new User("John", "Smith");
//        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getDefaultUser(ModelMap model) {

        model.addAttribute("user", "this is default movie");
        return "index";

    }

    private class User {
        private String name;
        private String surname;

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }
}
