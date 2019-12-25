package bridge;

abstract class Transfer {
    protected TransferTechnology technology;
    protected Transfer(TransferTechnology technology){
        this.technology = technology;
    }
    abstract public double transferMoney(long amount);
}
