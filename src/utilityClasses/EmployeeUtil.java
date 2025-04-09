package utilityClasses;

import Entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> getEmpoyeeList (){

        return Arrays.asList(new Employee("sham", "it", 5000.0),
                new Employee("ram", "hr", 9454.9),
                new Employee("soham", "recruter", 5000.0),
                new Employee("ramadhir", "admin", 9454.9));
    }
}
