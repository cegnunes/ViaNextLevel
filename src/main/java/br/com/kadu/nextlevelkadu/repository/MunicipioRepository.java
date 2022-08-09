package br.com.kadu.nextlevelkadu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kadu.nextlevelkadu.model.Municipio;

@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {

}

