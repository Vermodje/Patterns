package factory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

class Main {
    public static void main(String[] args) {
      Connection connection1 = FactoryConnection.getConnection("MySQL");
        connection1.setConnection();
    }
}
