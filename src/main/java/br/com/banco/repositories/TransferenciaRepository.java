package br.com.banco.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.banco.entities.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long>{
	@Query("SELECT obj FROM Transferencia obj WHERE obj.dataTransferencia BETWEEN :min and :max ORDER BY obj.dataTransferencia DESC")
	Page<Transferencia> findTranferencias(LocalDate min, LocalDate max, Pageable pageable);
}
