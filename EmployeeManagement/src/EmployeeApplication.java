public class EmployeeApplication {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Oana", "Dumea", 45);
        Employee emp2 = new Employee("Helen", "Last", 55);
        Manager mng1 = new Manager("Joe", "Duffy", 37);

        emp1.introduction();
        emp2.introduction();
        mng1.introduction();

        Employee employee = emp1;

     /*  public static void introduce;(Employee e){
            System.out.println(employee.introduction());
        }
*/

//        //see the output, the age is not incremented past 65
//        for(int i=0; i<70; i++ ){
//            emp1.incAge();
//            System.out.println(emp1.getAge());
//        }

    }
}


