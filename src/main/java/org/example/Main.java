package org.example;

import org.example.clasesSeleccion.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner entradaDatos = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        int option;

        System.out.println("----------- Atlético Nacional -----------");

        do {
            System.out.println("------- Seleccione una opcion -------");
            System.out.println(" Cantidad de jugadores ingresados al Atlético: "+ jugadores.size());
            System.out.println(" 1. Agregar jugador al Atlético Nacional ");
            System.out.println(" 2. Buscar jugador del Atlético Nacional ");
            System.out.println(" 3. Editar jugador del Atlético Nacional ");
            System.out.println(" 4. Mostrar a los jugadores covocados ");
            System.out.println(" 5. Cerrar programa ");

            option = entradaDatos.nextInt();

            switch (option){
                case 1:

                    if (jugadores.size() < 23){

                        Jugador objetoJugador = new Jugador();
                        System.out.println(" Ingresa el numero del jugador ");
                        int numeroJugador = entradaDatos.nextInt();
                        boolean bandera = false;

                        for (Jugador jugador:jugadores){
                            if (jugador.getNumeroJugador() == numeroJugador){
                                bandera = true;
                                break;
                            }else{
                                bandera = false;
                            }
                        }

                        if (bandera){
                            System.out.println(" El numero del jugador ya existe, intenta ingresar un nuevo numero  ");
                        }else{
                            objetoJugador.setNumeroJugador(numeroJugador);
                            System.out.print(" Ingresa el nombre del jugadoor: ");
                            objetoJugador.setNombre(entradaDatos.next());
                            System.out.print(" Ingresa los apellidos del jugador: ");
                            objetoJugador.setApellido(entradaDatos.next());
                            System.out.print(" Ingresa la posicion del jugador: ");
                            objetoJugador.setPosicion(entradaDatos.next());
                            System.out.print(" Ingresa la edad del jugador: ");
                            objetoJugador.setEdad(entradaDatos.nextInt());
                            System.out.print(" Ingresa el equipo del cual viene el jugador :");
                            objetoJugador.setEquipoJugador(entradaDatos.next());

                            jugadores.add(objetoJugador);
                        }


                    }else {
                        System.out.println(" El equipo esta completo ");
                    }
                    break;

                case 2:
                    int buscarJugador;
                    System.out.println(" Digita el numero del jugador que desea buscar ");
                    buscarJugador = entradaDatos.nextInt();
                    boolean jugadorNoEncontrado = false;
                    for (Jugador jugador:jugadores){
                        if(jugador.getNumeroJugador() == buscarJugador){
                            System.out.println(" El numero del jugador es: "+ jugador.getNumeroJugador());
                            System.out.println(" El nombre del jugador es: "+ jugador.getNombre());
                            System.out.println(" Los apellidos del jugador son: "+ jugador.getApellido());
                            System.out.println(" La posicion del jugador es: "+ jugador.getPosicion());
                            System.out.println(" La edad del jugador es: "+ jugador.getEdad());
                            System.out.println(" El equipo donde juega es: "+ jugador.getEquipoJugador());
                            jugadorNoEncontrado = false;
                            break;
                        }else {
                            jugadorNoEncontrado = true;
                        }

                    }
                    if (jugadorNoEncontrado){
                        System.out.println(" El jugador no fue encontrado ");
                    }else{
                        System.out.println(" La busqueda fue exitosa ");
                    }
                    break;

                case 3:
                    int editarJugador;
                    System.out.println(" Ingresa el número del jugador que quieres editar: ");
                    editarJugador = entradaDatos.nextInt();
                    int optionEditar;

                    for (Jugador jugador:jugadores) {
                        if(jugador.getNumeroJugador() == editarJugador){
                            System.out.println("------- El jugador está en la base de datos -------\n");

                            do {

                                System.out.println("1. Editar numero de camiseta: ");
                                System.out.println("2. Editar nombres: ");
                                System.out.println("3. Editar apellidos: ");
                                System.out.println("4. Editar posición del jugador: ");
                                System.out.println("5. Editar Edad del jugador: ");
                                System.out.println("6. Editar equipo del jugador");
                                System.out.println("7. Salir de la edición del jugador ");
                                optionEditar = entradaDatos.nextInt();

                                switch (optionEditar){
                                    case 1:
                                        int nuevoNumeroCamisete;
                                        System.out.print(" Digita el nuevo numero de la camiseta del " + " jugador: ");
                                        nuevoNumeroCamisete = entradaDatos.nextInt();
                                        for (Jugador verificarJugador: jugadores) {
                                            if (verificarJugador.getNumeroJugador() == nuevoNumeroCamisete){
                                                System.out.println(" El número ya existe ");
                                            }else{
                                                jugador.setNumeroJugador(nuevoNumeroCamisete);
                                                System.out.println(" Cambio de numero hecho ");
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println(" Ingrese el nuevo nombre del jugador: ");
                                        jugador.setNombre(entradaDatos.next());
                                        break;
                                    case 3:
                                        System.out.print(" Ingrese el nuevo apellido del jugador: ");
                                        jugador.setApellido(entradaDatos.next());
                                        break;

                                    case 4:
                                        System.out.print(" Ingrese la nueva posición del jugador: ");
                                        jugador.setPosicion(entradaDatos.next());
                                        break;

                                    case 5:
                                        System.out.print(" Edite la edad del jugador: ");
                                        int nuevaEdad = entradaDatos.nextInt();
                                        jugador.setEdad(nuevaEdad);
                                        break;

                                    case 6:
                                        System.out.print(" Ingrese el nuevo equipo del jugador: ");
                                        jugador.setEquipoJugador(entradaDatos.next());
                                        break;

                                    case 7:
                                        System.out.println(" Has elegido salir del editor");
                                        break;

                                    default:
                                        System.out.println(" Opcion no valida");
                                }


                            }while (optionEditar != 7);

                        }else{
                            System.out.println(" Jugador no encontrado");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Lista de jugadores");
                    for (Jugador jugador: jugadores) {

                        System.out.println("------------- jugador -------------\n");
                        System.out.println(" El numero del jugador es: " + jugador.getNumeroJugador());
                        System.out.println(" El nombre del jugador es: " + jugador.getNombre());
                        System.out.println(" El apellido del jugador es: " + jugador.getApellido());
                        System.out.println(" La posición del jugador es: "+ jugador.getPosicion());
                        System.out.println(" La edad del jugador es: " + jugador.getEdad());
                        System.out.println(" El equipo del jugador es: " + jugador.getEquipoJugador());

                    }
                    break;

                case 5:
                    System.out.println("----------- Programa cerrado -----------");
                    break;

                default:
                    System.out.println("Opcion no valida");


            }


        }while (option !=5);
    }
}