package com.marcos.muroMensajes.roles;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface RolDAO extends CrudRepository<Rol,String> {

	
}
