package com.pauloalencar.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pauloalencar.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
