package br.com.banco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.entities.Transferencia;
import br.com.banco.services.TransferenciaService;

@RestController
@RequestMapping(value = "/transferencias")
public class TransferenciaController {
	
	@Autowired
	private TransferenciaService service;
	
	@GetMapping
	public List<Transferencia> findTransferencias() {
		return service.findTransferencias();
	}

}
