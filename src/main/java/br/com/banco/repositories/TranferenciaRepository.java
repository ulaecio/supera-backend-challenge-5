package br.com.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.entities.Transferencia;

public interface TranferenciaRepository extends JpaRepository<Transferencia, Long>{

}
