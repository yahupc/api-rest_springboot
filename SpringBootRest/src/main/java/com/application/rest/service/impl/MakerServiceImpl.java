package com.application.rest.service.impl;

import com.application.rest.entities.Maker;
import com.application.rest.persintence.IMakerDAO;
import com.application.rest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MakerServiceImpl implements IMakerService {
    @Autowired
    private IMakerDAO makerDAO;
    @Override
    public List<Maker> findAll() {
        return makerDAO.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerDAO.findById(id);
    }

    @Override
    public void save(Maker maker) {
        makerDAO.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerDAO.deleteById(id);
    }
}
