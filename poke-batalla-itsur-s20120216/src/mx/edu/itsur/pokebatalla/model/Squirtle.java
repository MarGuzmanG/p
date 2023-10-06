/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

import java.util.ArrayList;

/**
 *
 * @author Maria Guadalupe Guzman Gonzalez
 */
public class Squirtle extends Pokemon{
    
    public Squirtle() {
        this.tipo = "AGUA";
        this.hp = 63;
        this.ataque = 94;
        this.defensa = 121;
        this.nivel = 1;
        this.precision = 3;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("TORRENTE");
        this.habilidades.add("PISTOLA DE AGUA");
        //....
    }    
    
    //Constructor alterno 1
    public Squirtle(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("TORRENTE")){
            //Logica del daño por TORRENTE
            System.out.println("Realizando TORRENTE");
        }else if(habilidad.equals("PISTOLA DE AGUA")){
            //Logica del daño por AQUA COLA
            System.out.println("Realizando PISTOLA DE AGUA");            
        }
        //TODO: otras habilidades...
    }
}
