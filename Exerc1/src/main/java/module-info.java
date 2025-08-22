module com.exemplo.exerc1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.exemplo.exerc1 to javafx.fxml;
    exports com.exemplo.exerc1;
}