package org.example;

import java.util.*;

/**
 * Representa una agenda de contactos con operaciones básicas de gestión.
 */
public class Agenda {
    private List<Contacto> contacts;

    /**
     * Constructor que inicializa una agenda vacía.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un contacto a la agenda o actualiza sus teléfonos si ya existe.
     * @param name Nombre del contacto.
     * @param phone Teléfono a asociar.
     */
    public void addContact(String name, String phone) {
        // ... (método sin cambios)
    }

    /**
     * Elimina un contacto de la agenda por nombre.
     * @param name Nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        // ... (método sin cambios)
    }

    /**
     * Modifica un número de teléfono existente de un contacto.
     * @param name Nombre del contacto.
     * @param oldPhone Teléfono a reemplazar.
     * @param newPhone Nuevo teléfono.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        // ... (método sin cambios)
    }

    /**
     * Obtiene la lista completa de contactos.
     * @return Lista de contactos.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}