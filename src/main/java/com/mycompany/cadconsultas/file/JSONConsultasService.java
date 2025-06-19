/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadconsultas.file;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.cadconsultas.listas.ListConsultas;

/**
 *
 * @author piva
 */
public class JSONConsultasService {
    public static String consultasToJSON(ListConsultas consultas) {
        try {
            // Convertendo objeto ListConsultas para JSON 
            ObjectMapper mapper = new ObjectMapper();						
            String jsonString = mapper.writeValueAsString(consultas);
            
            return jsonString;
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public static ListConsultas JSONToConsultas(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            ListConsultas consultas = mapper.readValue(jsonString, ListConsultas.class);
           						
            return consultas;
        } catch (JsonProcessingException e) {
            return null;
        }
    }  
}
