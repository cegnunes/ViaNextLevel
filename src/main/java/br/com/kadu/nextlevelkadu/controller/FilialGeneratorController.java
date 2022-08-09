package br.com.kadu.nextlevelkadu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.kadu.nextlevelkadu.model.FilialGenerator;
import br.com.kadu.nextlevelkadu.model.FilialGeneratorPK;
import br.com.kadu.nextlevelkadu.repository.FilialGeneratorRepository;
import br.com.kadu.nextlevelkadu.service.exception.ObjectNotFoundException;

@RestController
@RequestMapping(path = "api/filialGenerator")
public class FilialGeneratorController {

	@Autowired
	private FilialGeneratorRepository repo;
	
	@GetMapping(path = "consulta")
	public ResponseEntity<FilialGenerator> getFilialById(
			@RequestParam(name = "empresa", defaultValue = "0") Integer codigoEmpresa,
			@RequestParam(name = "filial", defaultValue = "0") Integer codigoFilial
			) {
		return ResponseEntity.ok().body(repo.findById(
				new FilialGeneratorPK(codigoEmpresa, codigoFilial)
				).orElseThrow(() -> new ObjectNotFoundException("Filial não encontrada!")));
				
	}
	
	@PostMapping
	public ResponseEntity<Void> addFilial(@RequestBody FilialGenerator filial) {
		repo.save(filial);
		return ResponseEntity.ok().build();
	}
	
}
