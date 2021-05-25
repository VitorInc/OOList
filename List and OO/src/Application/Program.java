package Application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("How many employees will be register ?");
        int N = in.nextInt();
        List<Employee> list = new ArrayList<>();
        for(int i = 0; i<N; i++){
            System.out.println("Employee #"+(i+1)+": ");
            System.out.print("Id: ");
            Integer id = in.nextInt();
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Salary: ");
            Double salary = in.nextDouble();
            Employee emp = new Employee(id, name, salary);
            list.add(emp);

        }
        System.out.println("Enter the employee id that will have salary increase");
        int idsalary = in.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = in.nextDouble();

            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }



        in.close();
    }
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
