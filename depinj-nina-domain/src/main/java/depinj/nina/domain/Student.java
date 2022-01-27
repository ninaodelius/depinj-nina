package depinj.nina.domain;

public class Student {

    private String givenName;

    private String surName;

    //constructor below
    public Student(String givenName, String surName){
        this.givenName = givenName;
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }







}
