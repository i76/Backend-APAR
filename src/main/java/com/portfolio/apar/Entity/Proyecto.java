/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.apar.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Agus16
 */
@Entity
public class Proyecto {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private int id;
  private String nombreproy;
  private String urlproy;

    public Proyecto() {
    }

    public Proyecto(String nombreproy, String urlproy) {
        this.nombreproy = nombreproy;
        this.urlproy = urlproy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreproy() {
        return nombreproy;
    }

    public void setNombreproy(String nombreproy) {
        this.nombreproy = nombreproy;
    }

    public String getUrlproy() {
        return urlproy;
    }

    public void setUrlproy(String urlproy) {
        this.urlproy = urlproy;
    }
 
  
  
  
}
