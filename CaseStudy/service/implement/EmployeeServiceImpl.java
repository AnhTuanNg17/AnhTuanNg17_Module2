package CaseStudy.service.implement;

import CaseStudy.model.Employee;
import CaseStudy.service.IEmployeeService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
        private static List<Employee> employeeList = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        static {
            employeeList.add(new Employee(10, "Tuan", "(15/10/2000)", "Male", 184448778,"0985554231" ,"anhtuan17@gmail.com","Uni", "Managenr",20000000));
            employeeList.add(new Employee(15, "Tuan","10/10/1999","Male", 184438777,"0977665231", "anhtuan111@gmail.com","Master","President",30000000));
        }


    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void add(Employee employee) {



    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void search(String val) {

    }

    @Override
    public void edit(Employee employee) {

    }
}
