module com.example.finalproject2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.finalproject2 to javafx.fxml;
    exports com.example.finalproject2;
}