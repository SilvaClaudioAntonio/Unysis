package br.com.unysis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.unysis.service.ClienteService;
import br.com.unysis.entity.ClienteEntity;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteService oClienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteEntity>> getAllClientes(){
		List<ClienteEntity> objService = oClienteService.getAllClientes();
		return new ResponseEntity<List<ClienteEntity>>(objService, new HttpHeaders(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<ClienteEntity> getCliente(@PathVariable("id") long id) throws Exception{
		ClienteEntity objService = oClienteService.getCliente(id);
		return new ResponseEntity<ClienteEntity>(objService, new HttpHeaders(), HttpStatus.OK);
		
	}
	@PostMapping
	public ResponseEntity<ClienteEntity> createOrUpdateCliente(@RequestBody ClienteEntity entity){
		ClienteEntity objService = oClienteService.createOrUpdateCliente(entity);
		return new ResponseEntity<ClienteEntity>(objService, new HttpHeaders(), HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public HttpStatus deleteClienteById(@PathVariable Long id) throws Exception{
		oClienteService.deleteClienteByID(id);
		return HttpStatus.OK;
	}
}
