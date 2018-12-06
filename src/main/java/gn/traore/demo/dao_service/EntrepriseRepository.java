package gn.traore.demo.dao_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import gn.traore.demo.entities.Entreprise;

@RepositoryRestResource
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
