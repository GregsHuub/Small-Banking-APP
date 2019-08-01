package greg.financialApp;

import java.math.BigDecimal;
import java.util.HashMap;

public class AccountCreator {

    private int accountId;
    private String name;
    private String lastName;
    private BigDecimal personalAmount;
    private String password;


    public AccountCreator(int accountId, String name, String lastName, BigDecimal personalAmount, String password) {
        this.accountId = accountId;
        this.name = name;
        this.lastName = lastName;
        this.personalAmount = personalAmount;
        this.password = password;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getPersonalAmount() {
        return personalAmount;
    }

    public void setPersonalAmount(BigDecimal personalAmount) {
        this.personalAmount = personalAmount;
    }

    @Override
    public String toString() {
        return "AccountCreator{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalAmount=" + personalAmount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}

