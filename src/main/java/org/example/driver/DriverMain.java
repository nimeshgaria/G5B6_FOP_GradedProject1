package org.example.driver;

import org.example.adminDepartment.AdminDepartment;
import org.example.hrDepartment.HrDepartment;
import org.example.superDepartment.SuperDepartment;
import org.example.techDepartment.TechDepartment;

public class DriverMain {
    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment  = new HrDepartment();
        TechDepartment techDepartment  =new TechDepartment();
        SuperDepartment superDepartment = new SuperDepartment();

        System.out.println(adminDepartment.departmentName());
        System.out.println(adminDepartment.getTodaysWork());
        System.out.println(adminDepartment.getWorkDeadline());
        System.out.println(superDepartment.isTodayAHoliday());
        System.out.println();

        System.out.println(hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println(hrDepartment.getTodaysWork());
        System.out.println(hrDepartment.getWorkDeadline());
        System.out.println(superDepartment.isTodayAHoliday());
        System.out.println();

        System.out.println(techDepartment.departmentName());
        System.out.println(techDepartment.getTodaysWork());
        System.out.println(techDepartment.getWorkDeadline());
        System.out.println(techDepartment.getTechStackInformation());
        System.out.println(superDepartment.isTodayAHoliday());
    }
}
