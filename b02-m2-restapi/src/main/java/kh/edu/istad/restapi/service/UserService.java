package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // YOUR LOGIC
    List<User> getAll();

    User getById(UUID id);

}
