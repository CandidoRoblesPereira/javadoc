package com.example;

/**
 * Esta clase gestiona la informacion basica de una persona.
 * @author candido
 */
public class Persona {
    String nombre;
    int edad;

    /**
     * Constructor de la clase persona.
     * @param nombre nombre a declarar 
     * @param edad Edad a declarar
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo que devuelve la edad de una persona
     * @return Devuelve la edad de la persona
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Metodo que se encaraga de declarar la edad de una persona
     * @param edad Edad a establecer
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que se encarga de devolver la edad de una Persona
     * @return Devuelve el nombre de la persona
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre Nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}