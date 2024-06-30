package com.example.springrestapi.SpringRestAPI.repository;

import com.example.springrestapi.SpringRestAPI.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository< Account, Long> {
}
