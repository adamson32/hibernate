
package impl;

import connect.HibernateUtil;
import dao.EmployeeDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import pojos.Pracownicy;


public class EmployeeDAOImpl implements EmployeeDAO{
    
    @Override
	public void addEmployee(Pracownicy employee) {

            Session session = HibernateUtil.getSessionFactory().openSession();
		try  {
			session.beginTransaction();
			Integer id =(Integer)session.save(employee);
			System.out.println("Employee is created  with Id::"+id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
            session.close();
                }
	}
        
        @Override
	public Pracownicy fetchEmployeebyId(int employeeId) {
		Pracownicy employee = null;
               Session session = HibernateUtil.getSessionFactory().openSession();         
		try  {
                          
                        employee =  (Pracownicy) session.get(Pracownicy.class, employeeId);
                        
                       if(employee != null){
				return employee;
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
                       return employee;
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
            session.close();
                }
		return null;
	}
        
        @Override
	public void deleteEmployeeById(Integer employeeId) {
            Session session = HibernateUtil.getSessionFactory().openSession();

		try  {
			Pracownicy employee = (Pracownicy) session.get(Pracownicy.class, employeeId);
			if(employee != null){
				session.beginTransaction();
				
				session.delete(employee);
				session.getTransaction().commit();
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
            session.close();
                }
	
	}
        
        @Override
	public void updateEmployeeById(int prac_id,String prac_imie,String prac_nazwisko,int prac_wiek,String prac_nr_telefonu,String prac_email) {
            Session session = HibernateUtil.getSessionFactory().openSession();
		try {

			Pracownicy employee = (Pracownicy) session.get(Pracownicy.class, prac_id);
			if(employee != null){
				employee.setPracImie(prac_imie);
                                employee.setPracNazwisko(prac_nazwisko);
                                employee.setPracWiek(prac_wiek);
                                employee.setPracNrTelefonu(prac_nr_telefonu);
                                employee.setPracEmail(prac_email);
				session.beginTransaction();
				session.update(employee);
				session.getTransaction().commit();
			}else{
				System.out.println("Employee doesn't exist with provideded Id..");
			}
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
            session.close();
                }
	}
     
    
    
}
