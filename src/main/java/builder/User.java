package builder;

import java.time.LocalDate;
import java.util.Date;

class User {
    private String name;
    private String surname;
    private LocalDate dateOfBirdth;
    private String email;
    private String phoneNumber;
    private String contry;
    private String job;
    private String hobby;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.dateOfBirdth = builder.dateOfBirth;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.contry = builder.contry;
        this.job = builder.job;
        this.hobby = builder.hobby;
    }

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

    public String getContry() {
        return contry;
    }

    public String getJob() {
        return job;
    }

    public String getHobby() {
        return hobby;
    }

    static class UserBuilder{
        private String name;
        private String surname;
        private LocalDate dateOfBirth;
        private String email;
        private String phoneNumber;
        private String contry;
        private String job;
        private String hobby;
        public UserBuilder(String name, String surname){
            this.name = name;
            this.surname = surname;
        }
        public UserBuilder setDateOfBirth (LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public UserBuilder setEmail (String email){
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public UserBuilder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public UserBuilder setCountry(String contry){
            this.contry = contry;
            return this;
        }
        public UserBuilder setJob(String job){
            this.job = job;
            return this;
        }
        public UserBuilder setHobby(String hobby){
            this.hobby = hobby;
            return this;
        }
        public User build(){
            return new User(this);
        }






    }

}
