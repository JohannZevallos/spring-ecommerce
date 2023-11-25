package com.cibertec.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Orden;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer>{

}