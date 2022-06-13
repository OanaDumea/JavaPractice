import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return e1.getFullName().compareTo(e2.getFullName());
    }
}
