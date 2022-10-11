package com.example.consulweb.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.consulweb.data.entidades.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long>{
    
    public UsuarioEntity findByEmail(String email);
    public UsuarioEntity findByUsername(String username);
    


}
