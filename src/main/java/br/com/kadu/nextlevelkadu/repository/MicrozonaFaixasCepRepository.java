package br.com.kadu.nextlevelkadu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kadu.nextlevelkadu.model.MicrozonaFaixasCep;
import br.com.kadu.nextlevelkadu.model.MicrozonaFaixasCepPK;

@Repository
public interface MicrozonaFaixasCepRepository extends JpaRepository<MicrozonaFaixasCep, MicrozonaFaixasCepPK>{

}

