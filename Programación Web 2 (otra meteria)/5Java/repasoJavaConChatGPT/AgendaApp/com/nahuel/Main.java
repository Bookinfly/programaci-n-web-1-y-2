package com.nahuel;

import com.nahuel.logica.Agenda;
import com.nahuel.modelo.Contacto;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Agenda agenda = new Agenda(5);
    System.out.println("¿Cuántos contactos desea ingresar? (máx 5)");
    int cantidad = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < cantidad; i++) {
      System.out.println("Contacto #" + (i +1));

      System.out.println("Nombre: ");
      String nombre = scanner.nextLine();

      System.out.print("Teléfono: ");
      String telefono = scanner.nextLine();

      System.out.print("Email: ");
      String email = scanner.nextLine();

      Contacto contacto = new Contacto(nombre, telefono, email);
      agenda.agregarContacto(contacto);

      System.out.println("✔ Contacto guardado");
    }

    System.out.println("\n📒 Agenda completa:");
    agenda.mostrarContactos();
    scanner.close();

    







    // Contacto c1 = new Contacto(" Lolo", " 42256699", " lolo@work.com");
    // Contacto c2 = new Contacto(" Pipo", " 42258888", " pipo@work.com");
    // Contacto c3 = new Contacto(" Koko", " 42289899",  "koko@work.com");

    // agenda.agregarContacto(c1);
    // agenda.agregarContacto(c2);
    // agenda.agregarContacto(c3);

    // agenda.mostrarContactos();
  }


}
