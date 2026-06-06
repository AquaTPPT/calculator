module com.aquatp.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aquatp.calculator to javafx.fxml;
    exports com.aquatp.calculator;
}