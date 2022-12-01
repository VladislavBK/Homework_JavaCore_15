public class PersonBuilderImpl implements PersonBuilder {

    public String name;
    public String lastName;
    public int age;
    public String city;

    public PersonBuilderImpl() {
    }
    @Override
    public PersonBuilderImpl setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public PersonBuilderImpl setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    @Override
    public PersonBuilderImpl setAge(int age) {
        this.age = age;
        return this;
    }
    @Override
    public PersonBuilderImpl setCity(String city) {
        this.city = city;
        return this;
    }
    @Override
    public Person build() {
        return new Person();
    }
}
