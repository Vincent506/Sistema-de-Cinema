module com.example.cinema {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.cinema to javafx.fxml;
    exports com.example.cinema;
}