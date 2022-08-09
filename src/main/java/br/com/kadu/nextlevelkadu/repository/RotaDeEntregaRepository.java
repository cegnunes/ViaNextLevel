package br.com.kadu.nextlevelkadu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kadu.nextlevelkadu.model.RotaDeEntrega;
import br.com.kadu.nextlevelkadu.model.RotaDeEntregaPK;

@Repository
public interface RotaDeEntregaRepository extends JpaRepository<RotaDeEntrega, RotaDeEntregaPK> {

}
