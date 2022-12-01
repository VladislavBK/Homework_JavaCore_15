public class Person {

    private String name;
    private String lastName;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Boolean hasAge() {
        return getAge() > 0;
    }

    public Boolean hasCity() {
        return getCity() == null;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        age++;
    }

    public PersonBuilderImpl newChildrenBuilder() {
        this.lastName = getLastName();
        this.age = getAge();
        this.city = getCity();
        return new PersonBuilderImpl();
    }
}
