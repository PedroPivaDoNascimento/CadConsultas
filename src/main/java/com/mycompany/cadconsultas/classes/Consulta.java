/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadconsultas.classes;

import java.util.Objects;

/**
 *
 * @author piva
 */
public class Consulta {
    private String id;
    private Paciente paciente;
    private Medico medico;
    private String data;

    public Consulta() {
        this.id = "";
        this.paciente = new Paciente();
        this.medico = new Medico();
        this.data = "";
    }

    public Consulta(String id, Paciente paciente, Medico medico, String data) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.paciente);
        hash = 41 * hash + Objects.hashCode(this.medico);
        hash = 41 * hash + Objects.hashCode(this.data);
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
        final Consulta other = (Consulta) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        return Objects.equals(this.medico, other.medico);
    }
    
    
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Consulta{");
        sb.append(", ID=").append(id);
        sb.append(", data=").append(data);
        if (!this.paciente.getCpf().isEmpty())
            sb.append("\n").append("paciente=").append(paciente);
        if (!this.medico.getCrm().isEmpty())
            sb.append("\n").append(", medico=").append(medico).append("\n");
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
}
