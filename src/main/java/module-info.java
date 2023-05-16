module com.example.calculator_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator_fx to javafx.fxml;
    exports com.example.calculator_fx;
}