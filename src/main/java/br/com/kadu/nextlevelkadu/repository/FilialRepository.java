package br.com.kadu.nextlevelkadu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kadu.nextlevelkadu.model.Filial;
import br.com.kadu.nextlevelkadu.model.FilialPK;

@Repository
public interface FilialRepository extends JpaRepository<Filial, FilialPK> {

}

