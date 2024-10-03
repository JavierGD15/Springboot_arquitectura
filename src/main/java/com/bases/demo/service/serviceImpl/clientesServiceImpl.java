package com.bases.demo.service.serviceImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bases.demo.common.CommonSvcImpl;
import com.bases.demo.model.clientesModel;
import com.bases.demo.repository.clientesRepository;
import com.bases.demo.service.clientesService;

@Service
public class clientesServiceImpl extends CommonSvcImpl<clientesModel, clientesRepository> implements clientesService {

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public Iterable<clientesModel> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<clientesModel> findById(int id) {
        
        return repository.findById(id);
    }

    @Override
    public clientesModel save(clientesModel entity) {
       
        return repository.save(entity);
    }

    @Override
    public Iterable<clientesModel> saveAll(Iterable<clientesModel> entities) {
        
        return repository.saveAll(entities);
    }

   
    
}
