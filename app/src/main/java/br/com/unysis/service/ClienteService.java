package br.com.unysis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.unysis.repository.ClienteRepository;
import br.com.unysis.entity.ClienteEntity;
 
@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository oClienteRepository;
	
	public List<ClienteEntity> getAllClientes(){
		
		List<ClienteEntity> oClienteList = oClienteRepository.findAll();
		
		if ( oClienteList.size() > 0) {
		 	 return oClienteList;
		}else {
			return new ArrayList<ClienteEntity>();
		}
	}
	public ClienteEntity getCliente(long id) throws Exception {
		
		Optional<ClienteEntity> oCliente = oClienteRepository.findById(id);
		
		if (oCliente.isPresent()) {
			return oCliente.get();
		}else {
			throw new Exception("Cliente não cadastrado para o ID informado!");
		}
	}
	public ClienteEntity createOrUpdateCliente(ClienteEntity entity) {
		
		Optional<ClienteEntity> obj = oClienteRepository.findById(entity.idCliente);
		
		if (obj.isPresent()) {
			ClienteEntity oClienteEntity = obj.get();
			oClienteEntity.setNomeCliente(oClienteEntity.getNomeCliente());
			oClienteEntity.setTipoCliente(oClienteEntity.getTipoCliente());
			oClienteEntity = oClienteRepository.save(oClienteEntity);
			return oClienteEntity;
		}else {
			entity = oClienteRepository.save(entity);
			return entity;
		}
	}
	public void deleteClienteByID(long id) throws Exception {
		
		Optional<ClienteEntity> obj = oClienteRepository.findById(id);
		
		if (obj.isPresent()) {
			oClienteRepository.deleteById(id);
		}else {
			throw new Exception("ID Informado não localizado!");
		}
		
	}
}
