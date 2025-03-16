package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un contacto con nombre y lista de teléfonos.
 */
public class Contacto {
    private String name;
    private List<String> phones;

    /**
     * Constructor para crear un nuevo contacto.
     * @param name Nombre del contacto.
     * @param phone Teléfono inicial.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Obtiene el nombre del contacto.
     * @return Nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de teléfonos del contacto.
     * @return Lista de teléfonos.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}