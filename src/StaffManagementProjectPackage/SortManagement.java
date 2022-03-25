package StaffManagementProjectPackage;

import SortPackage.SortByLastName;
import SortPackage.SortBySalaryAsc;
import SortPackage.SortBySalaryDesc;

import java.util.Collections;

import static StaffManagementProjectPackage.EmployeeManagement.alEmployees;
import static StaffManagementProjectPackage.Utilities.fixString;
import static StaffManagementProjectPackage.Utilities.getStringInput;

public class SortManagement {

    public static void sortByFirstName(){

        Collections.sort(alEmployees);

        UI.header();

        for (Employee e : alEmployees) {
            System.out.println("  " +
                    fixString(6, String.valueOf(e.getId())) +
                    fixString(22, e.getFirstname() + " " + e.getLastname()) +
                    fixString(22, e.getBirthday()) +
                    fixString(19, String.valueOf(e.getSalary())) +
                    fixString(18, e.getDepartment()));
        }
        UI.footer();
        System.out.println("\n Press any key to continue.");
        getStringInput();


    }


   public static void sortByLastName(){
       alEmployees.sort(new SortByLastName());

       UI.header();

       for (Employee e : alEmployees) {
           System.out.println("  " +
                   fixString(6, String.valueOf(e.getId())) +
                   fixString(22, e.getFirstname() + " " + e.getLastname()) +
                   fixString(22, e.getBirthday()) +
                   fixString(19, String.valueOf(e.getSalary())) +
                   fixString(18, e.getDepartment()));
       }
       UI.footer();
       System.out.println("\n Press any key to continue.");
       getStringInput();


   }


    public static void sortSalaryAscendingOrder(){
        alEmployees.sort(new SortBySalaryAsc());

        UI.header();

        for (Employee e : alEmployees) {
            System.out.println("  " +
                    fixString(6, String.valueOf(e.getId())) +
                    fixString(22, e.getFirstname() + " " + e.getLastname()) +
                    fixString(22, e.getBirthday()) +
                    fixString(19, String.valueOf(e.getSalary())) +
                    fixString(18, e.getDepartment()));
        }
        UI.footer();
        System.out.println("\n Press any key to continue.");
        getStringInput();


    }
    public static void sortSalaryDescendingOrder(){

        alEmployees.sort(new SortBySalaryDesc());

        UI.header();

        for (Employee e : alEmployees) {
            System.out.println("  " +
                    fixString(6, String.valueOf(e.getId())) +
                    fixString(22, e.getFirstname() + " " + e.getLastname()) +
                    fixString(22, e.getBirthday()) +
                    fixString(19, String.valueOf(e.getSalary())) +
                    fixString(18, e.getDepartment()));
        }
        UI.footer();
        System.out.println("\n Press any key to continue.");
        getStringInput();


    }



}
