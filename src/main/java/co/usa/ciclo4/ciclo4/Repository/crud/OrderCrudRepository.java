/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo4.ciclo4.Repository.crud;

import co.usa.ciclo4.ciclo4.Modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


/**
 *
 * @author Ivonne
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    
    
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);

    
    @Query("{status: ?0}")
    public List<Order> findByStatus(String status);
    
    //public List<Order> findByQuantitiesAndSalesMan(String);
    
     public Optional<Order> findTopByOrderByIdDesc() ;
    
}
