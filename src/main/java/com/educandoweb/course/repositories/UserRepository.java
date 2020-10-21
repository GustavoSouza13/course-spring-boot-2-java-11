package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// @Repository - É opcional, pois extende JpaRepository, que já está mapeada (registrada) para o framework
public interface UserRepository extends JpaRepository<User, Long> {

}
