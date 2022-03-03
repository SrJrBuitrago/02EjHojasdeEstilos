module es.ideas.ejhojasdeestilos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens es.ideas.ejhojasdeestilos to javafx.fxml;
    exports es.ideas.ejhojasdeestilos;
}
