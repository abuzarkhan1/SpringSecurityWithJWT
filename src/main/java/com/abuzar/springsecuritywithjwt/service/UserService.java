package com.abuzar.springsecuritywithjwt.service;

import com.abuzar.springsecuritywithjwt.entities.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<Users> store = new ArrayList<>();

    public UserService() {
        store.add(new Users(UUID.randomUUID().toString(), "Abuzar", "abuzar@gmail.com"));
        store.add(new Users(UUID.randomUUID().toString(), "Anas", "anas@gmail.com"));
        store.add(new Users(UUID.randomUUID().toString(), "Danish", "danish@gmail.com"));
    }

    public List<Users> getUsers() {
        return this.store;
    }
}
