module com.example.lr1_roz_obch {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.compiler;


    opens com.example.lr1_roz_obch to javafx.fxml;
    exports com.example.lr1_roz_obch;
}