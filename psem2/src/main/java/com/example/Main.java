package com.example;

//trabajo semana 2

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Pepe Guamo", 30, "defensa", 10, "las Máquinas");
    Jugador jugador2 = new Jugador("Armando Paredes de Casas", 40, "delantero", 01, "Tigres rojos");

    
    jugador1.mostrarInformacion();
    jugador2.mostrarInformacion();

    
    jugador1.setEdad(31);
    jugador2.setEquipo("Tigres Naranjas");

    
    jugador1.mostrarInformacion();
    jugador2.mostrarInformacion();
    }
}