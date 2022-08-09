package br.com.kadu.nextlevelkadu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kadu.nextlevelkadu.model.TipoDeAtividade;
import br.com.kadu.nextlevelkadu.service.TipoDeAtividadeService;

@RestController
@RequestMapping(path = "api/tipoDeAtividade")
// http://localhost:8080/api/cliente
public class TipoDeAtividadeController {
	
	@Autowired
	private TipoDeAtividadeService service;
	
	// http://localhost:8080/api/tipoDeAtividade/D
	@GetMapping(path = "{codigo}")
	public ResponseEntity<TipoDeAtividade> findById(@PathVariable String codigo) {
		TipoDeAtividade tipoDeAtividade = service.findById(codigo);
		return ResponseEntity.ok().body(tipoDeAtividade);
	}

}
