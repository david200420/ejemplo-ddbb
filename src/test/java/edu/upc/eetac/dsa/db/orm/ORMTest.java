package edu.upc.eetac.dsa.db.orm;

import edu.upc.eetac.dsa.db.orm.model.Employee;
import org.junit.Test;

public class ORMTest {


   @Test
   public void registerTest() {
    String url = "127.0.0.1";
       String user = "root";
       String password = "1234";

        Session session = FactorySession.openSession(); //url, user, password);
        Employee employee = new Employee("1", "Pepito","ds@gmail.com" ,23);
        session.save(employee); // INSERT INTO employee (idXXX, pepito, ...)

        //
        // POST ==> hi ha un nou usuari a la taula POU
        //
    }

    @Test
    public void loginTest() {
        String url = "127.0.0.1";
        String user = "root";
        String password = "Eljoda";

        Session session = FactorySession.openSession(url, user, password);

        Employee e = (Employee)session.get(Employee.class,"id" , "idxxx");
        Employee es = (Employee)session.get(Employee.class, "email", "toni@upc.edu");



    }
}

