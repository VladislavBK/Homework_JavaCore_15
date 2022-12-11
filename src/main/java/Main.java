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

        try {
            boolean check = mom.getName() == null ||
                    mom.getLastName() == null ||
                    mom.getAge() == 0 ||
                    mom.hasCity();
            if (check) {
                new PersonBuilderImpl().build();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            boolean check = mom.hasAge();
            if (check) {
                new PersonBuilderImpl().setNewAge(-100).build();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
