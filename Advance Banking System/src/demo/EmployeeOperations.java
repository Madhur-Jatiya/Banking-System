package demo;

import java.io.*;
import java.util.*;

public class EmployeeOperations {

    Scanner sc = new Scanner(System.in);
    BufferedWriter writer = null;
    Employee emp = new Employee();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        EmployeeOperations employeeOperations = new EmployeeOperations();
        System.out.println("\t\tWelcome to Employee Management System \n\n");
        while (true) {

            System.out.println("1. View all employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit an employee");
            System.out.println("4. Delete an employee");
            System.out.println("5. Quit");

            System.out.print("Enter = ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n \t\t List of all employees \n");
                    employeeOperations.getAllEmployees();
                    break;
                case 2:
                    employeeOperations.addNewEmployees();
                    System.out.println("\nNew Employees added successfully\n");
                    break;
                case 3:
                    employeeOperations.addToList(choice);
                    System.out.println("\nEmployee information updated successfully\n");
                    break;
                case 4:
                    employeeOperations.addToList(choice);
                    System.out.println("\nEmployee Deleted");
                    break;
                case 5:
                    System.out.println("\n\t\t Thanks for visit Employee Management System ");
                    return;
                default:
                    System.out.println("\n Invalid choice. Please try again.\n");
                    break;
            }
        }

    }

    public void addNewEmployees() throws IOException {
        try {
            writer = new BufferedWriter(new FileWriter("files\\employee.txt", true));

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.print("\nEnter Name = ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Age = ");
        emp.setAge(sc.nextInt());

        System.out.print("Enter Email = ");
        emp.setEmailId(sc.next());

        System.out.print("Enter Mobile = ");
        emp.setMobileNumber(sc.next());

        System.out.print("Enter Salary = ");
        emp.setSalary(sc.nextDouble());

        writer.write(emp.toString());
        writer.newLine();
        writer.close();
    }

    public void getAllEmployees() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("files\\employee.txt"));
            String line = reader.readLine();
            if (line == null) {
                System.out.println("No Employee are present\n");
            }
            int count = 0;
            while (line != null) {
                count++;
                System.out.println("Employee " + count + " = " + line);
                line = reader.readLine();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void addToList(int x) {
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("files\\employee.txt"));
            String line = reader.readLine();
            if (line == null) {
                System.out.println("No Employee are present\n");
            }
            System.out.print("\n Enter Employee Number = ");
            int empNo = sc.nextInt();
            sc.nextLine();
            System.out.println();

            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }

            if (x == 3) {
                editEmployee(list, empNo);
            } else if (x == 4) {
                deleteEmployee(list, empNo);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public void editEmployee(ArrayList<String> list, int empNo) throws IOException {

        String parts[] = list.get(empNo - 1).split(", ");
        System.out.println("Employee " + empNo + " = " + list.get(empNo - 1) + "\n");

        System.out.println("1. Edit Name");
        System.out.println("2. Edit Mobile Number");
        System.out.println("3. Edit Email");
        System.out.println("4. Edit Age");
        System.out.println("5. Edit Salary");

        System.out.print("Enter = ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("New Name = ");
                parts[0] = sc.nextLine();
                break;
            case 2:
                System.out.print("New Mobile Number = ");
                parts[1] = sc.next();
                break;
            case 3:
                System.out.print("New Email = ");
                parts[2] = sc.next();
                break;
            case 4:
                System.out.print("New Age = ");
                parts[3] = Integer.toString(sc.nextInt());
                break;
            case 5:
                System.out.print("New Salary = ");
                parts[4] = Double.toString(sc.nextDouble());
                break;
            default:
                System.out.println("\n Invalid choice. Please try again.\n");
                return;
        }

        list.set(empNo - 1, String.join(", ", parts));

        BufferedWriter writer = new BufferedWriter(new FileWriter("files\\employee.txt"));
        for (String employee : list) {
            writer.write(employee);
            writer.newLine();
        }
        writer.close();
    }

    public void deleteEmployee(ArrayList<String> list, int empNo) throws IOException {
        list.remove(empNo - 1);
        BufferedWriter writer = new BufferedWriter(new FileWriter("files\\employee.txt"));
        for (String employee : list) {
            writer.write(employee);
            writer.newLine();
        }
        writer.close();
    }
}
