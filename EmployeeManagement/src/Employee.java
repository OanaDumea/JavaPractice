public class Employee {
    //attributes
    protected String firstName;
    protected String lastName;
    protected String department;
    protected int employeeId;
    protected int age;

    //constructor
    public Employee (String empFName, String empLName, int empAge) {
        this.firstName = empFName;
        this.lastName = empLName;
        this.age = empAge;
    }






    public String getFullName(){
        return firstName + " " + lastName;
    }


    public String introduction(){
        return getFullName() + age;
//        System.out.println("Full name: " + getFullName());
////        System.out.println("Department: " + department);
////        System.out.println("Id: " + employeeId);
//        System.out.println("Age: " + age);
    }
    public void incAge(){
        if(age<65){
            age++;
        }
    }

    //getter
    public int getAge() {
        return age;
    }
}
