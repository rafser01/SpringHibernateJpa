/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j2ee.model;

/**
 *
 * @author Administrator
 */

import javax.persistence.*;

@Entity
@Table(name = "product")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "select p from Product p"),
    @NamedQuery(name = "Product.findById", query = "select p from Product p where p.id=:id")
})
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	
	
	private String name;
	private int qty;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
