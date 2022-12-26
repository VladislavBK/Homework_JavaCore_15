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
        boolean checkAge = this.newAge < 0;
        if (checkAge) {
            throw new IllegalArgumentException("Введите корректный возраст");
        }
        return this;
    }
    @Override
    public PersonBuilderImpl setNewCity(String newCity) {
        this.newCity = newCity;
        return this;
    }
    @Override
    public Person build() {
        boolean check = newName == null || newLastName == null || newAge == 0 || newCity == null;
        if (check) {
            throw new IllegalStateException("Заполните обязательные поля");
        }
        return new Person(newName, newLastName, newAge, newCity);
    }

}
