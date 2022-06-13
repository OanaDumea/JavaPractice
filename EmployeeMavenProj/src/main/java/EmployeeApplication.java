import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeApplication {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Oana", "Dumea", "HR", 2756, 45);
        Employee emp2 = new Employee("Joe", "Duffy", "IT", 8649, 34);

        //emp1.introduction();
        //emp2.introduction();

        Manager manager = new Manager("Goe", 68);
        //manager.introduction();

        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);

        Collections.sort(employeeList,new EmployeeNameComparator());
/*
        Employee[] employees = {emp1, emp2, manager};
        employees.add(new Employee(emp1,emp2,manager));
*/


        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        for (int i=0; i< employees.size(); i++){
            System.out.println(employees.get(i));
        }

        Manager manager2 = new Manager("Daniel Sand", 34);
        Employee emp3 = new Employee("John Quin", 27);
        manager2.addEmployee(emp3);

        Manager superManager = new Manager("Helen Clark", 30);
        superManager.addEmployee(manager);
        superManager.addEmployee(manager2);

        System.out.println(superManager);
    }

}


