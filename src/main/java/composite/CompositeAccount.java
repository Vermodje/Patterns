package composite;

import java.util.ArrayList;
import java.util.List;

class CompositeAccount implements Account {
    private List<Account> accounts = new ArrayList<>();
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account){
        accounts.remove(account);
    }

    @Override
    public void getDetails() {
        accounts.forEach(Account::getDetails);
    }
}
