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
            Employee e = new Employee(id, name, salary);
            list.add(e);

        }
        System.out.println("Enter the employee id that will have salary increase");
        int idsalary = in.nextInt();


        in.close();
    }
}
