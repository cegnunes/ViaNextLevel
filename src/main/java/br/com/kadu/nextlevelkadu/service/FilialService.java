package br.com.kadu.nextlevelkadu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kadu.nextlevelkadu.model.Empresa;
import br.com.kadu.nextlevelkadu.model.Filial;
import br.com.kadu.nextlevelkadu.model.FilialPK;
import br.com.kadu.nextlevelkadu.repository.EmpresaRepository;
import br.com.kadu.nextlevelkadu.repository.FilialRepository;

@Service
public class FilialService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private FilialRepository repo;
	
	public Filial getFilialById(Integer codigoEmpresa, Integer codigoFilial) {
		Empresa empresa = empresaRepository.findById(codigoEmpresa).orElse(null);
		FilialPK id = new FilialPK();		
		id.setEmpresa(empresa);
		id.setCodigo(codigoFilial);
		return repo.findById(id).orElse(null);
	}
}

