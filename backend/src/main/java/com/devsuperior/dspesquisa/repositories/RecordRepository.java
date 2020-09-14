package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Record;

//objeto responsavel por acessar dados de Record
public interface RecordRepository extends JpaRepository<Record, Long> {

}
