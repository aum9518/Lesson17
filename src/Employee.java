public class Employee extends  Person{
    private int id;
    @Override
    public void work() {

        if (id == 0 ){
            System.out.println("Jumushchu ishtebeyt");
        } else if (id == 1) {
            System.out.println("Jumushchu ishteit");
        }
    }



    public Employee(String name, String gender , int id) {
        super(name, gender);
        this.id = id;
    }
}
