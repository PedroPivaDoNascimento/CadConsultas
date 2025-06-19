/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadconsultas.file;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.cadconsultas.listas.ListPacientes;

/**
 *
 * @author piva
 */
public class JSONPacientesService {
    public static String pacientesToJSON(ListPacientes pacientes) {
        try {
            // Convertendo objeto ListPacientes para JSON 
            ObjectMapper mapper = new ObjectMapper();						
            String jsonString = mapper.writeValueAsString(pacientes);
            
            return jsonString;
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static ListPacientes JSONToPacientes(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ListPacientes pacientes = mapper.readValue(jsonString, ListPacientes.class);
           						
            return pacientes;
        } catch (JsonProcessingException e) {
            return null;
        }
    }  
}
