package es.uax.dam.dint.c2324.agendacontactos.contactosModel;/*
Clase que nos permite trabajar con contactos dentro de mi aplicación
 */

import java.lang.Comparable;

public class Contacto implements Comparable<Contacto> {
    private int id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String instagram;

    public Contacto(int id, String nombre, String apellidos, String telefono, String email, String instagram) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.instagram = instagram;
    }

    public Contacto(int id) {
        this.id = id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Contacto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", instagram='" + instagram + '\'' +
                '}';
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    @Override
    public int compareTo(Contacto o) {
        return Integer.compare(this.id, o.id);
    }
}