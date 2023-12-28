module ec.edu.espol.juego3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ec.edu.espol.juego3 to javafx.fxml;
    exports ec.edu.espol.juego3;
}
