package sg.edu.rp.c346.democustomcontactlist;

import javax.security.auth.PrivateCredentialPermission;

public class Contact {
    private String name;
    private int countrycode;
    private int phonenum;
    private char gender;

    public Contact(String name, int countrycode, int phonenum, char gender) {
        this.name = name;
        this.countrycode = countrycode;
        this.phonenum = phonenum;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(int countrycode) {
        this.countrycode = countrycode;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }
}
