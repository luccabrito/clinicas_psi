package br.com.lucca.mvc.clinicas.repository;

import br.com.lucca.mvc.clinicas.model.Clinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepository extends JpaRepository<Clinica, Long> {

}