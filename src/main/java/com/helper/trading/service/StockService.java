package com.helper.trading.service;

import com.helper.trading.model.Stock;
import com.helper.trading.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StockService {
    private StockRepository repository;

    @Autowired
    public void setRepository(StockRepository repository) {
        this.repository = repository;
    }

    public Stock get(Long id) {
        return repository.findOne(id);
    }

    public Set<Stock> getAll() {
        return repository.findAll();
    }
}