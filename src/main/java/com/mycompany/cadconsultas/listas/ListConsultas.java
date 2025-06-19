/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadconsultas.listas;

import com.mycompany.cadconsultas.classes.Consulta;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author piva
 */
public class ListConsultas {

    
    private List<Consulta> listConsultas;

    public ListConsultas() {
        this.listConsultas = new ArrayList<>();
    }

    public ListConsultas(List<Consulta> listConsultas) {
        this.listConsultas = listConsultas;
    }
    
    public List<Consulta> getListConsultas() {
        return listConsultas;
    }

    public void setListConsultas(List<Consulta> listConsultas) {
        this.listConsultas = listConsultas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.listConsultas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListConsultas other = (ListConsultas) obj;
        return Objects.equals(this.listConsultas, other.listConsultas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (Consulta c : this.listConsultas) {
            sb.append(c.toString()).append("\n");
        }
        
        return sb.toString();
    }
    
    public Consulta findConsultaById(String id) {
        for (Consulta c : this.listConsultas) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        
        return null;
    } 
    
    public boolean add(Consulta c) {
        if (this.findConsultaById(c.getId()) == null) {
            this.listConsultas.add(c);
            return true;
        }
        
        return false;
    }
    
    public boolean remove(String id) {
        Consulta removed = this.findConsultaById(id);
        
        if (removed != null) {
            this.listConsultas.remove(removed);
            return true;
        }
        
        return false;
    }
    
    public boolean edit(String idEdited, Consulta newData) {
        Consulta edited = this.findConsultaById(idEdited);
        
        if (edited != null) {
            int editedIndice = this.listConsultas.indexOf(edited);
            this.listConsultas.set(editedIndice, newData);
            return true;
        }
        
        return false;
        
        
    }
    
    
    
    
}
