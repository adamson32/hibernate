
package serviceImpl;

import impl.EmployeeDAOImpl;
import pojos.Pracownicy;
import service.EmployeeService;


public class EmployeeServiceImpl implements EmployeeService{
     @Override
	public void createEmployee(Pracownicy employee) {
		new EmployeeDAOImpl().addEmployee(employee);
	}
        
        @Override
	public Pracownicy getEmployeebyId(int employeeId) {
		return new EmployeeDAOImpl().fetchEmployeebyId(employeeId);
	}
        
        @Override
	public void deleteEmployeeById(Integer employeeId) {
		new EmployeeDAOImpl().deleteEmployeeById(employeeId);
	}
        
        @Override
	public void updateEmployeeById(int prac_id,String prac_imie,String prac_nazwisko,int prac_wiek,String prac_nr_telefonu,String prac_email) {
		new EmployeeDAOImpl().updateEmployeeById(prac_id,prac_imie,prac_nazwisko,prac_wiek,prac_nr_telefonu,prac_email);
	}
}
