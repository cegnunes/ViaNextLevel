package br.com.kadu.nextlevelkadu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kadu.nextlevelkadu.model.TipoDeAtividade;

@Repository
public interface TipoDeAtividadeRepository extends JpaRepository<TipoDeAtividade, String> {

}
