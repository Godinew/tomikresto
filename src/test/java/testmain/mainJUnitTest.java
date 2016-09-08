/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmain;

import com.company.dao.GamerDao;
import com.company.general.Factory;
import com.company.tables.Gamer;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Java1X
 */
public class mainJUnitTest {
    
    public mainJUnitTest() {
        try {
    ListUsers() ;
        } catch (SQLException ex) {
            Logger.getLogger(mainJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    @Test
//public void testMultiply() throws SQLException {
//   // Проверяемый метод
//   Factory factory = Factory.getInstance();
//		GamerDao gamerDao = factory.GetGamerDao();
//		gamerDao.addGamer(new Gamer("435354", "password"));
//                //Создание пользователя в базе данных 
//            //assertEquals("435354",   gamerDao.getGamer(1).getLogin()) ;
//}
    
 @Test    
public void ListUsers() throws SQLException {
   // Проверяемый метод
     Factory factory = Factory.getInstance();
		GamerDao gamerDao = factory.GetGamerDao();
		
                //Вывод списка пользователь в базе данных 
                for (Gamer r:gamerDao.getGamers()){
                    System.out.println(r.getLogin());
                    if (r.getLogin().equals("Megamega1")){System.out.println("Наш пользователь в базе данных");}
                }
}  


    


    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
