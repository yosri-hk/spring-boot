package tn.esprit.exercice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exercice.entities.Stock;
import tn.esprit.exercice.services.IStockService;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    IStockService iStockService;
    @GetMapping("stock/getall")
    public List<Stock> retrieveAllStocks(){
        return iStockService.retrieveAllStocks();
    }
    @PostMapping("stock/add")
    public Stock addStock(@RequestBody Stock s) {
        return iStockService.addStock(s);
    }
    @PutMapping("stock/update")
    public Stock updateStock(@RequestBody Stock s){
       return iStockService.updateStock(s) ;}
    @GetMapping("stock/{id}")
    public Stock retrieveStock(@PathVariable Long id){
        return iStockService.retrieveStock(id);
    }
    @DeleteMapping("stock/{id}")
    public void removeStock(@PathVariable Long id){
        iStockService.removeStock(id);
    }
}

