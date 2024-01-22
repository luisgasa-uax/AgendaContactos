module es.uax.dam.dint.c2324.agendacontactos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires com.google.gson;

    opens es.uax.dam.dint.c2324.agendacontactos to javafx.fxml;
    exports es.uax.dam.dint.c2324.agendacontactos;
}