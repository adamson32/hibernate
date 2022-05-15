
package dao;
import pojos.Pracownicy;

public interface EmployeeDAO {
     public abstract void addEmployee(Pracownicy employee);
    public abstract Pracownicy  fetchEmployeebyId(int employeeId);
    public abstract void  deleteEmployeeById(Integer employeeId);
    public abstract void updateEmployeeById(int prac_id,String prac_imie,String prac_nazwisko,int prac_wiek,String prac_nr_telefonu,String prac_email);
}
