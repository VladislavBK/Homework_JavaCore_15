public interface PersonBuilder {
    PersonBuilderImpl setNewName(String newName);
    PersonBuilderImpl setNewLastName(String newLastName);
    PersonBuilderImpl setNewAge(int newAge);
    PersonBuilderImpl setNewCity(String newCity);
    Person build();

}
