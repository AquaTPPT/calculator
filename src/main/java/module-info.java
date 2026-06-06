module com.aquatp.calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.aquatp.calculator to javafx.fxml;
    exports com.aquatp.calculator;
    exports com.aquatp.calculator.enums;
    opens com.aquatp.calculator.enums to javafx.fxml;
    exports com.aquatp.calculator.userinterface;
    opens com.aquatp.calculator.userinterface to javafx.fxml;
    exports com.aquatp.calculator.calculus;
    opens com.aquatp.calculator.calculus to javafx.fxml;
}
