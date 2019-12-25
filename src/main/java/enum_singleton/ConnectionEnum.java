package enum_singleton;

enum ConnectionEnum {
    MY_SQL,
    H2;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
