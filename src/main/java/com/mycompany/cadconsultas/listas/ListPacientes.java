/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadconsultas.listas;

import com.mycompany.cadconsultas.classes.Paciente;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author piva
 */
public class ListPacientes {
    private List<Paciente> listPacientes;

    public ListPacientes() {
        this.listPacientes = new ArrayList<>();
    }

    public ListPacientes(List<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }

    public List<Paciente> getListPacientes() {
        return listPacientes;
    }

    public void setListPacientes(List<Paciente> listPacientes) {
        this.listPacientes = listPacientes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.listPacientes);
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
        final ListPacientes other = (ListPacientes) obj;
        return Objects.equals(this.listPacientes, other.listPacientes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (Paciente p : this.listPacientes) {
            sb.append(p.toString()).append("\n");
        }
        
        return sb.toString();
    }

    public Paciente findPacienteByCpf(String cpf) {
        for (Paciente p : this.listPacientes) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        
        return null;
    } 
    
    public boolean add(Paciente p) {
        if (this.findPacienteByCpf(p.getCpf()) == null) {
            this.listPacientes.add(p);
            return true;
        }
        
        return false;
    }
    
    public boolean remove(String cpf) {
        Paciente removed = this.findPacienteByCpf(cpf);
        
        if (removed != null) {
            this.listPacientes.remove(removed);
            return true;
        }
        
        return false;
    }
    
    public boolean edit(String cpfEdited, Paciente newData) {
        Paciente edited = this.findPacienteByCpf(cpfEdited);
        
        if (edited != null) {
            int editedIndice = this.listPacientes.indexOf(edited);
            this.listPacientes.set(editedIndice, newData);
            return true;
        }
        
        return false;
        
        
    }
    
    
    
    
}
