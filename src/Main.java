public class Main {
    public static void main(String[] args) {

        Person person = new Employee("Manas","Male",1);
        Person person1 = new Employee("Ulan","Male",0);
        Person[] people = {person1,person};
        for (Person a:people) {
            System.out.println(a.getName()+a.getGender());
            a.work();
        }
    }
}