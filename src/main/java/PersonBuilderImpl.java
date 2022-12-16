public class PersonBuilderImpl implements PersonBuilder {

    public String newName;
    public String newLastName;
    public int newAge;
    public String newCity;

    public PersonBuilderImpl() {
    }
    @Override
    public PersonBuilderImpl setNewName(String newName) {
        this.newName = newName;
        return this;
    }
    @Override
    public PersonBuilderImpl setNewLastName(String newLastName) {
        this.newLastName = newLastName;
        return this;
    }
    @Override
    public PersonBuilderImpl setNewAge(int newAge) {
        this.newAge = newAge;
        return this;
    }
    @Override
    public PersonBuilderImpl setNewCity(String newCity) {
        this.newCity = newCity;
        return this;
    }
    @Override
    public Person build() {
        return new Person(newName, newLastName, newAge, newCity);
    }

}
