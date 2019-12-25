package prototype;

abstract class Account implements Cloneable {
    protected String type;
    protected String status;
    abstract void getDetails();
    abstract String getStatus();
    abstract void  setStatus(String status);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
