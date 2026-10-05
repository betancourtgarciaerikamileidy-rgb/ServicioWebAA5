package com.mycompany.serviciowebaa5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioWebAA5 {

    // Almacena los usuarios registrados.
    private static final Map<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Registro de un usuario de prueba.
        registrar("erika", "12345");

        System.out.println("=== SERVICIO WEB - REGISTRO E INICIO DE SESIÓN ===");

        System.out.print("Ingrese usuario: ");
        String usuario = entrada.nextLine();

        System.out.print("Ingrese contraseña: ");
        String contrasena = entrada.nextLine();

        // Se valida la autenticación.
        if (autenticar(usuario, contrasena)) {
            System.out.println("Autenticación satisfactoria.");
        } else {
            System.out.println("Error en la autenticación.");
        }

        entrada.close();
    }

    // Método para registrar un usuario.
    public static void registrar(String usuario, String contrasena) {
        usuarios.put(usuario, contrasena);
    }

    // Método para validar usuario y contraseña.
    public static boolean autenticar(String usuario, String contrasena) {
        return usuarios.containsKey(usuario)
                && usuarios.get(usuario).equals(contrasena);
    }
}