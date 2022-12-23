public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilderImpl()
                .setNewName("Анна")
                .setNewLastName("Вольф")
                .setNewAge(31)
                .setNewCity("Сидней")
                .build();
        Person son = mom.newChildrenBuilder()
                .setNewName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
    }
}
