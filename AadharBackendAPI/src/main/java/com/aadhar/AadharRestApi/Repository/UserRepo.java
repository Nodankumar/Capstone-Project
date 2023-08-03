package com.aadhar.AadharRestApi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.aadhar.AadharRestApi.Entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
