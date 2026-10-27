package stringbasic.university;

public class Person {
    private String nev;

    private String email;

    private String taj;

    private String bankszamlaszam;

    private String telefonszam;

    public Person(String nev, String email, String taj, String bankszamlaszam, String telefonszam) {
        this.nev = nev;
        this.email = email;
        this.taj = taj;
        this.bankszamlaszam = bankszamlaszam;
        this.telefonszam = telefonszam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTaj() {
        return taj;
    }

    public void setTaj(String taj) {
        this.taj = taj;
    }

    public String getBankszamlaszam() {
        return bankszamlaszam;
    }

    public void setBankszamlaszam(String bankszamlaszam) {
        this.bankszamlaszam = bankszamlaszam;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }
}
