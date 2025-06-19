/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadconsultas.file;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.cadconsultas.listas.ListMedicos;

/**
 *
 * @author piva
 */
public class JSONMedicosService {
    public static String medicosToJSON(ListMedicos medicos) {
        try {
            // Convertendo objeto ListMedicos para JSON 
            ObjectMapper mapper = new ObjectMapper();						
            String jsonString = mapper.writeValueAsString(medicos);
            
            return jsonString;
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static ListMedicos JSONToMedicos(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ListMedicos medicos = mapper.readValue(jsonString, ListMedicos.class);
           						
            return medicos;
        } catch (JsonProcessingException e) {
            return null;
        }
    }  

    public static String professoresToJSON(ListMedicos medicosCadastrados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
