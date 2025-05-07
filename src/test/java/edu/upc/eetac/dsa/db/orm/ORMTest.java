package edu.upc.eetac.dsa.db.orm;

import edu.upc.eetac.dsa.db.orm.model.Employee;
import org.junit.Assert;
import org.junit.Test;

public class ORMTest {


   @Test
   public void registerTest() {
    String url = "127.0.0.1";
       String user = "root";
       String password = "1234";

       Session session = FactorySession.openSession("127.0.0.1:3306/dsaapp", "root", "Eljoda");
        Employee employee = new Employee("idxxx","1", "Pepito","ds@gmail.com" ,23);
        session.save(employee); // INSERT INTO employee (idXXX, pepito, ...)

        //
        // POST ==> hi ha un nou usuari a la taula POU
        //
    }

    @Test
    public void loginTest() {
       registerTest();
        Session session = FactorySession.openSession("127.0.0.1:3306/dsaapp", "root", "Eljoda");

        Employee e  = (Employee) session.get(Employee.class, "id",    "idxxx");
        Employee es = (Employee) session.get(Employee.class, "email", "ds@gmail.com");
        System.out.println(e.getName());
        Assert.assertEquals(e.getId(), es.getId());

    }
}

