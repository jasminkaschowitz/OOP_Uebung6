import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    ArrayList<Employee> mitarbeiter = new ArrayList<>();

    public void addEmployee(Employee neu) {
        mitarbeiter.add(neu);
    }

    public ArrayList<Employee> salaryByDepartment(String dep) {
        double currentAmount = 0;
        ArrayList<Employee> department = new ArrayList<>();
        for (Employee employee : mitarbeiter) {
            double sum = 0;
            if (employee.getDepartment().equals(dep)) {
                department.add(employee);
                employee.setBaseSalary(employee.getFullSalary() + currentAmount);
                currentAmount = employee.getBaseSalary();


            }
        }
        System.out.println(dep + " " + currentAmount);
        return department;
    }

    public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> personenListe = new HashMap<>();
        for (Employee employee : mitarbeiter) {
            String dep = employee.getDepartment(); //String dep erhält für jeden Employee die Abteilung
            double salary = employee.getFullSalary();
            if (personenListe.containsKey(dep)) { // falls die HashMap bereits den Key bzw. die Abteilung enthält
                double currentValue = personenListe.get(dep); //value vom bereits gespeicherten Objekt in Hashmap der Variable zusweisen
                personenListe.put(dep, currentValue + salary); // Überschreibung des alten Keys
            } else {
                personenListe.put(dep, salary);
            }
        }
        return personenListe;
    }

    public double getTotalSalary() {
        double sum = 0;
        for (Employee employee: mitarbeiter) {
            sum += employee.getFullSalary();


        }
        return sum;
    }

    public double getAverageSalary() {
        return getTotalSalary() / mitarbeiter.size();
    }

    public HashMap<String, Integer> getCountInDepartment() {
        HashMap<String, Integer> dep = new HashMap<>();
        for (Employee employee: mitarbeiter) {
            String department = employee.getDepartment();
            if (dep.containsKey(department)) {
                dep.put(department, dep.get(department)+1);
            }
            else {
                dep.put(department, 1);
            }
        }


        return dep;
    }


    @Override
    public String toString() {
        return "EmployeeManager{" +
                "mitarbeiter=" + mitarbeiter +
                '}';
    }
}
