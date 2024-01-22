package es.uax.dam.dint.c2324.agendacontactos.contactosModel.gestorContactos.noSQL.fireBase;
/* Enlace con la BBDD (capa de API de mi aplicación con respecto de la implementación
de BBDD que necesite utilizar según necesidad)
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import es.uax.dam.dint.c2324.agendacontactos.contactosModel.Contacto;
import es.uax.dam.dint.c2324.agendacontactos.contactosModel.gestorContactos.GestorContactosInterface;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GestorContactosFireBase implements GestorContactosInterface {

    public List<Contacto> cargarContactos() {
        return null;
    }

    public void guarContactos(List<Contacto> contactos){

    }
}