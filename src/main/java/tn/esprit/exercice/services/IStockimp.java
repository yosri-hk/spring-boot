package tn.esprit.exercice.services;

import org.springframework.stereotype.Service;
import tn.esprit.exercice.entities.Stock;
import tn.esprit.exercice.repository.StockRepository;

import java.util.List;
import java.util.Set;
@Service

public class IStockimp implements IStockService{
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }
    StockRepository stockRepository;
    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        stockRepository.deleteById(id);

    }
}
