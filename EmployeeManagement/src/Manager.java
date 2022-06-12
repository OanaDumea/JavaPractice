public class Manager extends Employee{

    private Employee [] managers;


    public Manager(String empFName,String empLName, int empAge) {
        super(empFName, empLName, empAge);
        managers = new Employee[100];

    }


    }



