package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        Agenda agendaContactos = new Agenda();
        initAgenda(agendaContactos);

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Contacto c : agendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        System.out.println("\nDespués de operaciones: ");
        for (Contacto c : agendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    // Añadir, Eliminar y Modificar contactos de la agenda.
    private static void initAgenda(Agenda agenda) {
        agenda.addContact("John Doe", "1234567890");
        agenda.addContact("Jane Doe", "9876543210");
        agenda.addContact("Mary Jane", "1122334455");
        agenda.addContact("John Doe", "6543219876");
        agenda.removeContact("Jane Doe");
        agenda.modifyPhoneNumber("John Doe", "1234567890", "6666666666");
    }
}