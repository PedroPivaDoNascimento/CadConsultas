/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadconsultas.listas;

import com.mycompany.cadconsultas.classes.Medico;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author piva
 */
public class ListMedicos {
    private List<Medico> listMedicos;

    public ListMedicos() {
        this.listMedicos = new ArrayList<>();
    }

    public ListMedicos(List<Medico> listMedicos) {
        this.listMedicos = listMedicos;
    }

    public List<Medico> getListMedicos() {
        return listMedicos;
    }

    public void setListMedicos(List<Medico> listMedicos) {
        this.listMedicos = listMedicos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.listMedicos);
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
        final ListMedicos other = (ListMedicos) obj;
        return Objects.equals(this.listMedicos, other.listMedicos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (Medico m : this.listMedicos) {
            sb.append(m.toString()).append("\n");
        }
        
        return sb.toString();
    }

    public Medico findMedicoByCrm(String crm) {
        for (Medico m : this.listMedicos) {
            if (m.getCrm().equals(crm)) {
                return m;
            }
        }
        
        return null;
    } 
    
    public boolean add(Medico m) {
        if (this.findMedicoByCrm(m.getCrm()) == null) {
            this.listMedicos.add(m);
            return true;
        }
        
        return false;
    }
    
    public boolean remove(String crm) {
        Medico removed = this.findMedicoByCrm(crm);
        
        if (removed != null) {
            this.listMedicos.remove(removed);
            return true;
        }
        
        return false;
    }
    
    public boolean edit(String crmEdited, Medico newData) {
        Medico edited = this.findMedicoByCrm(crmEdited);
        
        if (edited != null) {
            int editedIndice = this.listMedicos.indexOf(edited);
            this.listMedicos.set(editedIndice, newData);
            return true;
        }
        
        return false;
        
        
    }
    
    
    
    
}
