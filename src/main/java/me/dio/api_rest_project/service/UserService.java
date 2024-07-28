package me.dio.api_rest_project.service;

import me.dio.api_rest_project.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

}
