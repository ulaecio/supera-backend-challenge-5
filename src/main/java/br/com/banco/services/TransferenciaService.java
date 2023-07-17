package br.com.banco.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.banco.entities.Transferencia;
import br.com.banco.repositories.TransferenciaRepository;

@Service
public class TransferenciaService {
	
	@Autowired
	private TransferenciaRepository repository;
	
	public Page<Transferencia> findTransferencias(String minDate, String maxDate, Pageable pageable){
		
		LocalDate min = LocalDate.parse(minDate);
		LocalDate max = LocalDate.parse(maxDate);
		
		return repository.findTranferencias(min, max, pageable);
	}

}
