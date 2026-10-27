package stringbasic.university;

public class Student {

    private Person person;

    private String neptunCode;

    private String oktatasiAzonosito;

    private String belepoKartyaSzam;

    public Student(Person person, String neptunCode, String oktatasiAzonosito) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.oktatasiAzonosito = oktatasiAzonosito;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getOktatasiAzonosito() {
        return oktatasiAzonosito;
    }

    public void setOktatasiAzonosito(String oktatasiAzonosito) {
        this.oktatasiAzonosito = oktatasiAzonosito;
    }

    public String getBelepoKartyaSzam() {
        return belepoKartyaSzam;
    }

    public void setBelepoKartyaSzam(String belepoKartyaSzam) {
        this.belepoKartyaSzam = belepoKartyaSzam;
    }
}
