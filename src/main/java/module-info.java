module university.jala.aulaifx {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.sql;


    opens university.jala.aulaifx to javafx.fxml;
    exports university.jala.aulaifx;
}