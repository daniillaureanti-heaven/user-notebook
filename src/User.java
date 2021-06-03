public class User {

    public User() {
    }

    private String firstName;
    private String lastName;
    private int age;
    private String mail;
    private int phone;

    public User(String firstName, String lastName, int age, String mail, int phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mail = mail;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", phone=" + phone +
                '}';
    }
}
