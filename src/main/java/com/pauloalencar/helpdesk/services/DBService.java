package com.pauloalencar.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloalencar.helpdesk.domain.Chamado;
import com.pauloalencar.helpdesk.domain.Cliente;
import com.pauloalencar.helpdesk.domain.Tecnico;
import com.pauloalencar.helpdesk.domain.enums.Perfil;
import com.pauloalencar.helpdesk.domain.enums.Prioridade;
import com.pauloalencar.helpdesk.domain.enums.Status;
import com.pauloalencar.helpdesk.repositories.ChamadoRepository;
import com.pauloalencar.helpdesk.repositories.ClienteRepository;
import com.pauloalencar.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "63653230268", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Richard Stallman", "903.347.070-56", "stallman@mail.com", "123");
		Tecnico tec3 = new Tecnico(null, "Claude Elwood Shannon", "271.068.470-54", "shannon@mail.com", "123");
		Tecnico tec4 = new Tecnico(null, "Tim Berners-Lee", "162.720.120-39", "lee@mail.com", "123");
		Tecnico tec5 = new Tecnico(null, "Linus Torvalds", "778.556.170-27", "linus@mail.com", "123");
		
		Cliente cli1 = new Cliente(null ,"Linus Torvalds", "80527954780", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1); 
		
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5));		
		clienteRepository.saveAll(Arrays.asList(cli1));		
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
