
package zadanie1_hibernate;

import pojos.Pracownicy;
import service.EmployeeService;


public class Zadanie1_hibernate {

   
    public static void main(String[] args) {
        
    }
    
    private static void createEmployee(EmployeeService employeeService) {
        employeeService.createEmployee(getEmployee());
    }
    
    private static void deleteEmployeeById(EmployeeService employeeService) {
		employeeService.deleteEmployeeById(1);
	}
    
    private static Pracownicy getEmployee(){
		Pracownicy employee= new Pracownicy();
		employee.setPracImie("Adam");
		employee.setPracNazwisko("Nowak");
                employee.setPracWiek(22);
                employee.setPracNrTelefonu("123456789");
                employee.setPracEmail("adam@op.pl");
		
		return employee;
	}

    private static void getEmployeebyId(EmployeeService employeeService) {
        Pracownicy employee = employeeService.getEmployeebyId(1);
		System.out.println(employee.getPracId()+" "+employee.getPracImie()+" "+employee.getPracNazwisko());
    }
    
    private static void updateEmployeeById(EmployeeService employeeService) {
		employeeService.updateEmployeeById(5,"Maria","Kowalska",21,"234567891","maria.kowalska@op.pl");
	}
}
