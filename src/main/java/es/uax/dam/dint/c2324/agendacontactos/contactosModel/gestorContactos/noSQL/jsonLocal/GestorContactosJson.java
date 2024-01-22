package es.uax.dam.dint.c2324.agendacontactos.contactosModel.gestorContactos.noSQL.jsonLocal;
/* Enlace con la BBDD (capa de API de mi aplicación con respecto de la implementación
de BBDD que necesite utilizar según necesidad)
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import es.uax.dam.dint.c2324.agendacontactos.contactosModel.Contacto;
import es.uax.dam.dint.c2324.agendacontactos.contactosModel.gestorContactos.GestorContactosInterface;

public class GestorContactosJson implements GestorContactosInterface {

    private static final String RUTA_ARCHIVO_JSON = "contactos.json";
    private final Gson gson = new Gson();

    public List<Contacto> cargarContactos() {
        try(FileReader reader = new FileReader(RUTA_ARCHIVO_JSON)) {
            Type tipolista = new TypeToken<ArrayList<Contacto>>(){}.getType();
            return gson.fromJson(reader, tipolista );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void guarContactos(List<Contacto> contactos){
        try(FileWriter writer = new FileWriter(RUTA_ARCHIVO_JSON)){
            gson.toJson(contactos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}