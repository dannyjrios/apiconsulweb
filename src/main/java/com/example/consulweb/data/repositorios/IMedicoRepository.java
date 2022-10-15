package com.example.consulweb.data.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.consulweb.data.entidades.MedicoEntity;

@Repository
public interface IMedicoRepository extends CrudRepository<MedicoEntity, Long>{

    MedicoEntity findById (long id);
    
}
