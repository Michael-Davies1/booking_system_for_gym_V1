module com.example.booking_system_for_gym_v1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.booking_system_for_gym_v1 to javafx.fxml;
    exports com.example.booking_system_for_gym_v1;
}