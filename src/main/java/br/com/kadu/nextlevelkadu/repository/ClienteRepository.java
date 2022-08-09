package br.com.kadu.nextlevelkadu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kadu.nextlevelkadu.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	//extends JpaRepository não precisamos implementar querys no código

	public Cliente findByCpf(String cpf);

}

