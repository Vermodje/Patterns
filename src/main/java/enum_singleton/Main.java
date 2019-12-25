package enum_singleton;

class Main {
    public static void main(String[] args) {
        ConnectionEnum connectionEnum1 = ConnectionEnum.MY_SQL;
        ConnectionEnum connectionEnum2 = ConnectionEnum.MY_SQL;
        connectionEnum1.setCount(1);
        connectionEnum2.setCount(2);
        System.out.println(connectionEnum1.getCount());
        System.out.println(connectionEnum2.getCount());

    }
}
