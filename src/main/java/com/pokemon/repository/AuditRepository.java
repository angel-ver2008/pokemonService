package com.pokemon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.entity.Audit;

public interface AuditRepository extends JpaRepository<Audit,Long>  {

}
