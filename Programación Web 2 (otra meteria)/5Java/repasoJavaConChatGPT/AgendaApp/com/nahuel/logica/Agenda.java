package com.nahuel.logica;

import com.nahuel.modelo.Contacto;

public class Agenda {
  private Contacto[] contactos;
  private int cantidad;

  public Agenda(int capacidad) {
    contactos = new Contacto[capacidad];
    cantidad = 0;
  }

  public void agregarContacto(Contacto nuevo) {
    if (cantidad < contactos.length) {
      contactos[cantidad] = nuevo;
      cantidad++;
    } else {
      System.out.println("Agenda llena");
    }
  }

  public void mostrarContactos() {
    if (cantidad == 0) {
      System.out.println("La agenda esta vacía");
    } else {
      for (int i = 0; i < cantidad; i++) {
        System.out.println("---------");
        contactos[i].mostrarContacto();
      }
    }
  }
}