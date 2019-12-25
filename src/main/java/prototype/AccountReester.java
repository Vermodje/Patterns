package prototype;

import java.util.HashMap;
import java.util.Map;

class AccountReester  {
    private static Map<String, Account> accountMap = new HashMap<>();
    public static Account getCopy (String type){
        Account account = null;
        try {
            account = (Account) accountMap.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return account;
    }
    public static void add (Account account){
        accountMap.put(account.type, account);
    }
}
