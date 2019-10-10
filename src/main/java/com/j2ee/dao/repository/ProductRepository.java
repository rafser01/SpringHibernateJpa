/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2ee.dao.repository;

import com.j2ee.model.Product;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
    public List<Product> findByName(String name);
}
