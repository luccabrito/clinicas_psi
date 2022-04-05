package br.com.lucca.mvc.clinicas.repository;

import br.com.lucca.mvc.clinicas.model.Clinica;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ClinicaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Clinica> recuperaTodasAsClinicas() {
        Query query = entityManager.createQuery("select p from Clinica p", Clinica.class);
        return query.getResultList();
    }
}