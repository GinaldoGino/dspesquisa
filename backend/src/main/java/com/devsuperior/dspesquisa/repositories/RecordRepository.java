package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Record;

//objeto responsavel por acessar dados de Record
@Repository //registra como componente gerenciado pelo SpringBoot em injeções de dependência
public interface RecordRepository extends JpaRepository<Record, Long> {

}
