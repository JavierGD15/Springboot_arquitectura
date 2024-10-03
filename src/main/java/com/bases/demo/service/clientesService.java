package com.bases.demo.service;

import java.util.Optional;

import com.bases.demo.common.CommonSvc;
import com.bases.demo.model.clientesModel;

public interface clientesService extends CommonSvc<clientesModel> {
    public Iterable<clientesModel> findAll();
    public Optional<clientesModel> findById(int id);
    public clientesModel save(clientesModel entity);
    public void deleteById(int id);
    Iterable<clientesModel> saveAll(Iterable<clientesModel> entities);
}
