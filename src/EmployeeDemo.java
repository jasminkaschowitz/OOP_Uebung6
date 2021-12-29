import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDemo {

    public static void main(String[] args) {

        FixCommissionEmployee person1 = new FixCommissionEmployee("Mustermann", "Max", "Controlling", 3000, 200);
        System.out.println(person1.getFullSalary());
        PercentCommissionEmployee person2 = new PercentCommissionEmployee("Musterfrau", "Henriette", "Marketing", 2000, 10);
        System.out.println(person2.getFullSalary());
        EmployeeManager person3 = new EmployeeManager();
        person3.getSalaryByDepartment();



        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.addEmployee(
                new FixCommissionEmployee("Susi", "Sorglos", "Finance", 3700, 100));
        employeeManager.addEmployee(
                new PercentCommissionEmployee("Max", "Muster", "HR", 3500, 3));
        employeeManager.addEmployee(
                new Employee("John", "Supermanager", "Finance", 4000));


        System.out.println("------------------");
        System.out.println("Gesamte Lohnkosten: " + employeeManager.getTotalSalary());


        System.out.println(employeeManager.getSalaryByDepartment());
        employeeManager.salaryByDepartment("Finance");

        System.out.println("Durchschnittliche Lohnkosten: " + employeeManager.getAverageSalary());
        System.out.println(employeeManager.getCountInDepartment());

        /* HashMap<String, List<Integer>> gradesOfStudents = new HashMap<>();
        List <Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(3);
        grades.add(2);
        gradesOfStudents.put("Max Mustermann", grades);
        gradesOfStudents.put("Frau Mustermann", grades);

        for (Map.Entry<String, List<Integer>> gradesPerStudent : gradesOfStudents.entrySet()) {
            String student = gradesPerStudent.getKey();
            List <Integer> noten = gradesPerStudent.getValue();
            System.out.println(student + " " + noten);
        }

        for (String students: gradesOfStudents.keySet()) {

            List<Integer> noten = gradesOfStudents.get(students);
            System.out.println(students + " " + noten);
        }*/




    }
}
