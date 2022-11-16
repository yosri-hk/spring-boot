package tn.esprit.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.entities.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer> {

}
