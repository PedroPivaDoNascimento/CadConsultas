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
public class Medico {
    private String name;
    private String crm;
    private String especialidade;
    private String horariosDisponiveis;

    public Medico() {
        this.name = "";
        this.crm = "";
        this.especialidade = "";
        this.horariosDisponiveis = "";
    }

    public Medico(String name, String crm, String especialidade, String horariosDisponiveis) {
        this.name = name;
        this.crm = crm;
        this.especialidade = especialidade;
        this.horariosDisponiveis = horariosDisponiveis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(String horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.crm);
        hash = 83 * hash + Objects.hashCode(this.especialidade);
        hash = 83 * hash + Objects.hashCode(this.horariosDisponiveis);
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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.crm, other.crm)) {
            return false;
        }
        if (!Objects.equals(this.especialidade, other.especialidade)) {
            return false;
        }
        return Objects.equals(this.horariosDisponiveis, other.horariosDisponiveis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medico{");
        sb.append("name=").append(name);
        sb.append(", crm=").append(crm);
        sb.append(", especialidade=").append(especialidade);
        sb.append(", horariosDisponiveis=").append(horariosDisponiveis);
        sb.append('}');
        return sb.toString();
    }  
}
