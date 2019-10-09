/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2ee.dao;

import com.j2ee.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Service("jpaService")
@Repository
@Transactional
public class ProductServiceImpJpa implements ProductService{
    @PersistenceContext
    private EntityManager em;

     
    
    @Override
    @Transactional(readOnly = true)
    public List<Product> getProducts() {
        return em.createQuery("select p from Product p").getResultList();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
