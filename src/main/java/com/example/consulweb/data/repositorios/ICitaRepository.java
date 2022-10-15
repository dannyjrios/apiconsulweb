package com.example.consulweb.data.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.consulweb.data.entidades.CitaEntity;

@Repository
public interface ICitaRepository extends PagingAndSortingRepository<CitaEntity, Long> {
    
}
