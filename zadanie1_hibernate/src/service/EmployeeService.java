
package service;
import pojos.Pracownicy;

public interface EmployeeService {
      public abstract void createEmployee(Pracownicy employee);
    public abstract Pracownicy  getEmployeebyId(int employeeId);
    public abstract void  deleteEmployeeById(Integer employeeId);
    public abstract void updateEmployeeById(int prac_id,String prac_imie,String prac_nazwisko,int prac_wiek,String prac_nr_telefonu,String prac_email);
    
}
