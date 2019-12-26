package builder;

import java.time.LocalDate;
import java.util.Date;

class Account {
    private String name;
    private String surname;
    private LocalDate dateOfBirdth;
    private String email;
    private String phoneNumber;
    private String country;
    private String job;
    private String hobby;
    private boolean privileges;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirdth() {
        return dateOfBirdth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getJob() {
        return job;
    }

    public String getHobby() {
        return hobby;
    }

    public boolean getPrivileges() {
        return privileges;
    }

    interface AccountBuilder {
        Account build();

        AccountBuilder setName(String name);

        AccountBuilder setSurname(String surname);

        AccountBuilder setDataOfBirth(LocalDate dataOfBirth);

        AccountBuilder setEmail(String email);

        AccountBuilder setPhoneNumber(String phoneNumber);

        AccountBuilder setCountry(String country);

        AccountBuilder setJob(String job);

        AccountBuilder setHobby(String hobby);
    }

    static class PrimaryAccountBuilder implements AccountBuilder {
        private Account account;

        public PrimaryAccountBuilder() {
            this.account = new Account();
            this.account.privileges = true;
        }

        @Override
        public Account build() {
            return account;
        }

        @Override
        public AccountBuilder setName(String name) {
            account.name = name;
            return this;
        }

        @Override
        public AccountBuilder setSurname(String surname) {
            account.surname = surname;
            return this;
        }

        @Override
        public AccountBuilder setDataOfBirth(LocalDate dataOfBirth) {
            account.dateOfBirdth = dataOfBirth;
            return this;
        }

        @Override
        public AccountBuilder setEmail(String email) {
            account.email = email;
            return this;
        }

        @Override
        public AccountBuilder setPhoneNumber(String phoneNumber) {
            account.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public AccountBuilder setCountry(String country) {
            account.country = country;
            return this;
        }

        @Override
        public AccountBuilder setJob(String job) {
            account.job = job;
            return this;
        }

        @Override
        public AccountBuilder setHobby(String hobby) {
            account.hobby = hobby;
            return this;
        }
    }

}


