package br.com.kadu.nextlevelkadu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kadu.nextlevelkadu.model.FilialGenerator;
import br.com.kadu.nextlevelkadu.model.FilialGeneratorPK;

@Repository
public interface FilialGeneratorRepository extends JpaRepository<FilialGenerator, FilialGeneratorPK> {

}
