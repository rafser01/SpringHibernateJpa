/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2ee.dao;

import com.j2ee.dao.repository.ProductRepository;
import com.j2ee.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ProductRepository productRepository;
    
    @Override
    @Transactional(readOnly = true)
    public List<Product> getProducts() {
//        return em.createQuery("select p from Product p").getResultList();

        return em.createNamedQuery("Product.findAll").getResultList();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findProductById(int id) {
        TypedQuery productQuery=  em.createNamedQuery("Product.findById", Product.class);
        productQuery.setParameter("id", id);
        return (Product) productQuery.getSingleResult();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
