package prototype;

class OrdinalAccount extends Account {
    public OrdinalAccount() {
        this.type = "ordinal";
        this.status = "active";
    }
    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    @Override
    void getDetails() {
        System.out.println("It is" + this.type);
    }
}
