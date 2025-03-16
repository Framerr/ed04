package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con un nombre y una lista de teléfonos.
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     * Crea un nuevo contacto con un teléfono inicial.
     * @param name Nombre del contacto.
     * @param phone Teléfono inicial.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     * @return Nombre del contacto.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece un nuevo nombre para el contacto.
     * @param name Nuevo nombre.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la lista de teléfonos del contacto.
     * @return Lista de teléfonos (copia defensiva).
     */
    public List<String> getPhones() {
        return new ArrayList<>(phones); // Copia para encapsulación
    }

    /**
     * Reemplaza la lista de teléfonos del contacto.
     * @param phones Nueva lista de teléfonos.
     */
    public void setPhones(List<String> phones) {
        this.phones = new ArrayList<>(phones); // Copia para encapsulación
    }
}