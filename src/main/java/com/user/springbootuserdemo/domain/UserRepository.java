package com.user.springbootuserdemo.domain;

import com.user.springbootuserdemo.domain.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
