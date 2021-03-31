package com.viniciusaugusto.kubernetesjava.repositories;

import com.viniciusaugusto.kubernetesjava.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
