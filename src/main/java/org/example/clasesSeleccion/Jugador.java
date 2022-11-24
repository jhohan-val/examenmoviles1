package org.example.clasesSeleccion;

import java.util.Scanner;

public class Jugador {

    Scanner entradaDatos = new Scanner(System.in);

    private int numeroJugador;
    private String nombre;
    private String apellido;
    private String posicion;
    private int edad;
    private String equipoJugador;

    public Jugador() {
    }

    public Jugador(int numeroJugador, String nombre, String apellido, String posicion, int edad, String equipoJugador){

        this.numeroJugador = numeroJugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.edad = edad;
        this.equipoJugador = equipoJugador;
    }

    public int getNumeroJugador() {return numeroJugador;}

    public void setNumeroJugador(int numeroJugador) {this.numeroJugador = numeroJugador;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getPosicion() {return posicion;}

    public void setPosicion(String posicion) {this.posicion = posicion;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {

        while (edad <= 18){
            System.out.print("La edad minima debe ser 18 años, digita nuevamente la edad:  ");
            edad = entradaDatos.nextInt();
        }
        this.edad = edad;
    }

    public String getEquipoJugador() {return equipoJugador;}

    public void setEquipoJugador(String equipoJugador) {this.equipoJugador = equipoJugador;}

}