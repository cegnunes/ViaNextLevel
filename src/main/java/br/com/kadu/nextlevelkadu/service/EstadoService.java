package br.com.kadu.nextlevelkadu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kadu.nextlevelkadu.model.Estado;
import br.com.kadu.nextlevelkadu.repository.EstadoRepository;
import br.com.kadu.nextlevelkadu.service.exception.ObjectNotFoundException;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;

	public List<Estado> findAll() {
		return repo.findAll();
	}

	public Estado addEstado(Estado estado) {
		return repo.save(estado);
	}

	public Estado findById(String sigla) {
		return repo.findById(sigla)
				.orElseThrow(() -> new ObjectNotFoundException("Estado não encontrado!"));
	}

	public void update(String sigla, Estado estado) {
		Estado estadoAtualizado = this.findById(sigla);
		estadoAtualizado.setDescricao(estado.getDescricao());
		repo.save(estadoAtualizado);
	}

	public void delete(String sigla) {
		this.findById(sigla);
		repo.deleteById(sigla);
	}

}
