package com.cibertec.service;

import java.util.List;


import com.cibertec.model.Orden;
import com.cibertec.model.Usuario;

public interface IOrdenService  {
	List<Orden> findAll();
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
