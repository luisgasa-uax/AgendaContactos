package es.uax.dam.dint.c2324.agendacontactos.contactosModel.gestorContactos;

import es.uax.dam.dint.c2324.agendacontactos.contactosModel.Contacto;

import java.util.List;

public interface GestorContactosInterface {
    public List<Contacto> cargarContactos();
    public void guarContactos(List<Contacto> contactos);
}
