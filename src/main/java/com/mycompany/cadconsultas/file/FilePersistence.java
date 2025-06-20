/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadconsultas.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author piva
 */
public class FilePersistence {
    public static void saveToFile(String data, String filePath) {
        try {
            try (FileWriter arq = new FileWriter(filePath)) {
                PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.print(data);
            }
        } catch (IOException ex) {
            Logger.getLogger(FilePersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String loadFromFile(String filePath) {
        String conteudoLido = "";
        try {
            //cria o objeto arquivo
            File file = new File(filePath);
            //cria o scanner que vai ler o arquivo
            Scanner scanner = new Scanner(file);

            //efetua a litura linha por linha, copiando do arquivo para uma string 'ConteudoLido'
            scanner.useDelimiter("\\Z"); // ler até o final da linha
            while (scanner.hasNext()) {
                conteudoLido += scanner.next();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conteudoLido;
    }
}
