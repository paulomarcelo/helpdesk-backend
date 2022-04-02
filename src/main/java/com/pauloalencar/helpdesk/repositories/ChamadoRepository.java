package com.pauloalencar.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pauloalencar.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
