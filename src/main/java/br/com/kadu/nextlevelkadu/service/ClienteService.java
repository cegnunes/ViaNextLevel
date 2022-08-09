package br.com.kadu.nextlevelkadu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kadu.nextlevelkadu.model.Cliente;
import br.com.kadu.nextlevelkadu.repository.ClienteRepository;

@Service 
public class ClienteService {

	@Autowired
    private ClienteRepository repo;
	
	//Metodo que devolve uma lista de clientes
	public List<Cliente> findAll() {
		
        //Teste sem acesso ao banco
		//Cliente cliente1 = new Cliente(1, "Kadu");
   	    //Cliente cliente2 = new Cliente(2, "Kadu Segundo");
   	    //Cliente cliente3 = new Cliente(3, "Kadu 3");
   	    //Cliente cliente4 = new Cliente(4, "Kadu 4");
   	    //List<Cliente> clientes = new ArrayList<>(); //Criar uma lista de clientes
		//clientes.addAll(Arrays.asList(cliente1, cliente2, cliente3, cliente4)); //Add os clientes a lista

		List<Cliente> clientes = new ArrayList<>();
		clientes = repo.findAll();
		
		return clientes; //Retorna os clientes
	}

}

