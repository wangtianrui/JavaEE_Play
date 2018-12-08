package models;


import javax.persistence.Entity;

@Entity
public class User {
    public String email;
    public String passWord;
    public String fullName;
    public String isAdmin;

    public User(String email, String passWord, String fullName, String isAdmin) {
        this.email = email;
        this.passWord = passWord;
        this.fullName = fullName;
        this.isAdmin = isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}
