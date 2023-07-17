package br.com.banco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<Transferencia> findTransferencias(Pageable pageable) {
		return service.findTransferencias(pageable);
	}

}
