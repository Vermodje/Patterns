package factory_method;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Connection connection = FactoryProducer.createConnection("sql").create();

    }
}


