package prototype;

 class PrimaryAccount extends Account {
    public PrimaryAccount() {
        this.type = "primary";
        this.status="active";
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
