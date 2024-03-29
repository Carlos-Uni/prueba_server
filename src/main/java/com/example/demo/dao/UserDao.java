package com.example.demo.dao;

import com.example.demo.model.DAOUser;
import com.example.demo.model.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String name);
}
