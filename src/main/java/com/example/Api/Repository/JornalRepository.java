package com.example.Api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Api.Models.JornalModel;

public interface JornalRepository extends JpaRepository <JornalModel,String> {
    
}
