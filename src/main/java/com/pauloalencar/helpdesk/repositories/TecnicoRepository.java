package com.pauloalencar.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pauloalencar.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
