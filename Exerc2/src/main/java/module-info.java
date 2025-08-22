module com.exemplo.exerc2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.exemplo.exerc2 to javafx.fxml;
    exports com.exemplo.exerc2;
}