package org.example.methodReference;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();





//        List<EmployeeDTO> employeeDto = service.loadEmployeesFromDB()
//                .stream()
//                .map(   (employee) -> {
//                    EmployeeDTO employeeDTO = new EmployeeDTO();
//                    employeeDTO.setId(employee.getId());
//                    employeeDTO.setName(employee.getName());
//                    employeeDTO.setSalary(employee.getSalary());
//                    return employeeDTO;
//                }).collect(Collectors.toList());
//        System.out.println(employeeDto);

        //

        EmployeeMapper mapper = new EmployeeMapper();
        /*List<EmployeeDTO> e = service.loadEmployeesFromDB()
                .stream().map(mapper::convert).collect(Collectors.toList());
        System.out.println(e);*/

        // name list
        List<Employee> empList = service.loadEmployeesFromDB();
        System.out.println(empList);
        empList.stream().filter(emp -> (int)emp.getSalary() > 30000)
                .sorted((e1, e2) -> (int) (e1.getSalary()-e2.getSalary()))
                    .forEach(emp -> System.out.println(emp.getName() + ": Salary: " + emp.getSalary()));
    }


//        //anonymous implementation
//
//        service.loadEmployeesFromDB()
//                .stream()
//                .forEach(new Consumer<Employee>() {
//                    @Override
//                    public void accept(Employee employee) {
//                        System.out.println(employee);
//                    }
//                });
//
//        System.out.println("======================================================");
//
//        // lambda expression
//        service.loadEmployeesFromDB()
//                .forEach(employee -> System.out.println(employee));
//
//        System.out.println("======================================================");
//
//        // method reference
//        service.loadEmployeesFromDB().forEach( MethodReferenceDemo:: print);
//
//        System.out.println("======================================================");
//
//        //updated method reference using existing println method without creating customised method
//        service.loadEmployeesFromDB().forEach(System.out::println);
//
//
//        System.out.println("======================================================");
//
//    }





    public static void print(Employee employee){
        System.out.println(employee );
    }

}
