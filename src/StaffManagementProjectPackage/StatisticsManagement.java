package StaffManagementProjectPackage;
import EmployeeSubclassesPackage.*;

import static StaffManagementProjectPackage.EmployeeManagement.*;

import static StaffManagementProjectPackage.Utilities.*;

public class StatisticsManagement {

    public static void menPercentageDepartment(){
        double  numberOfMen = 0;
        double totalOnDepartment = 0;

        try {
            String department = choiceOfDepartment();

            for (Employee e : alEmployees) {

                char s = e.getBirthday().charAt(10);
                if (s % 2 == 1 && department.equalsIgnoreCase(e.getDepartment())) {
                    numberOfMen++;
                }
                if(department.equalsIgnoreCase(e.getDepartment())){
                    totalOnDepartment++;
                }
            }

            double menPercentage = (numberOfMen / totalOnDepartment) * 100;
            System.out.println("Percentage of men is: " + menPercentage + "% at the " + department + " department!");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Incorrect input of birthday, please update in update birthday option.");

        }

        getStringInput();
    }

    public static void bonusInDepartment(){


        String department = choiceOfDepartment();

        for ( Employee ee : alEmployees) {

            if (ee.getDepartment().equalsIgnoreCase(department)) {

                ee.employeeBonus();

            }
        }
        getStringInput();

    }

    public static void womenPercentage() {
        double numberOfWomen = 0;

        try {

            for (int i = 0; i < alEmployees.size(); i++) {
                char s = alEmployees.get(i).getBirthday().charAt(10);
                if (s % 2 == 0) {
                    numberOfWomen++;
                }
            }
            double womenPercentage = (numberOfWomen / alEmployees.size()) * 100;
            System.out.println("Percentage of women is: " + womenPercentage + "%" + " at your company!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Incorrect input of birthday, please update in update birthday option.");
        }

        getStringInput();

    }

    public static void averageSalary() {

        double sumSalary = 0;

        for (Employee e : alEmployees) {
            sumSalary = sumSalary + e.getSalary();
        }
        double averageSalary = sumSalary / alEmployees.size();

        System.out.println("The average salary is: " + averageSalary + " kr");

        getStringInput();
    }

    public static void averageSalaryDepartment() {
        double sumSalary = 0;
        int departmentSize = 0;

        String department = choiceOfDepartment();

        for (Employee e: alEmployees) {


            if (department.equalsIgnoreCase("Chief") && e instanceof Chief) {
                sumSalary = sumSalary + e.getSalary();
                departmentSize++;


            } else if (department.equalsIgnoreCase("DBAdmin") && e instanceof DBAdmin) {
                sumSalary = sumSalary + e.getSalary();
                departmentSize++;

            } else if (department.equalsIgnoreCase("Developer") && e instanceof Developer) {
                sumSalary = sumSalary + e.getSalary();
                departmentSize++;

            } else if (department.equalsIgnoreCase("Technician") && e instanceof Technician) {
                sumSalary = sumSalary + e.getSalary();
                departmentSize++;

            } else if (department.equalsIgnoreCase("Secretary") && e instanceof Secretary) {
                sumSalary = sumSalary + e.getSalary();
                departmentSize++;

            } else if (department.equalsIgnoreCase("Webdesigner") && e instanceof WebDesigner) {
                sumSalary = sumSalary + e.getSalary();
                departmentSize++;

            }
        }


        double averageSalary = sumSalary / departmentSize;

        System.out.println("The average salary is: " + averageSalary + " kr" + " at " + department + " department");


        getStringInput();
    }

    public static void maximumSalary() {
        int maximum = 0;

        for (int i = 1; i < alEmployees.size(); i++) {
            if (alEmployees.get(i).getSalary() > alEmployees.get(maximum).getSalary())
                maximum = i;
        }
        System.out.println("The highest salary is: " + alEmployees.get(maximum).getSalary() + " kr");

        getStringInput();

    }

    public static void minimumSalary() {
        int minimum = 0;

        for (int i = 1; i < alEmployees.size(); i++) {
            if (alEmployees.get(i).getSalary() < alEmployees.get(minimum).getSalary())
                minimum = i;
        }
        System.out.println("The lowest salary is : " + alEmployees.get(minimum).getSalary() + " kr");

        getStringInput();

    }


}
