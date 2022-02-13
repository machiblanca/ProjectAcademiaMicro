/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibm.academia.restapi.universidad;

import com.ibm.academia.restapi.universidad.modelo.entidades.Carrera;
import com.ibm.academia.restapi.universidad.servicios.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestUniversidad implements CommandLineRunner{
@Autowired
    private CarreraDAO carreraDAO;
            
    @Override
    public void run(String... args) throws Exception {
        Carrera IngenieriaSistemas = new Carrera(null, "sistemas", 60, 5, "bislas");
       Carrera carrera = carreraDAO.guardar(IngenieriaSistemas);
        System.out.println(carrera.toString());
    }
    
}
