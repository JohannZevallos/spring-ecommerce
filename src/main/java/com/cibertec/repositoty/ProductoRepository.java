package com.cibertec.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
