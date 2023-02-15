public class Employee extends  Person{
    private int id;
    @Override
    public void work() {

        if (id == 1 ){
            System.out.println("Jumushchu ishteyt");
        } else {
            System.out.println("Jumushchu ishtebeyt");
        }
    }



    public Employee(String name, String gender , int id) {
        super(name, gender);
        this.id = id;
    }
}
