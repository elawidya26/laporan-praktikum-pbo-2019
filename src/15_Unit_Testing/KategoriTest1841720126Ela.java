/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KategoriTest1841720126Ela extends TestCase{
    
    Kategori1841720126Ela instance ;
    
    public KategoriTest1841720126Ela() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
     
    @AfterClass
    public static void tearDownClass() {     
    }
    
    @Before
    public void setUp() {
        instance = new Kategori1841720126Ela("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test  %s\n", this.getName());
    }
    
    @Test
    public void testSave() {
        
        System.out.println("save test");
        this.instance.save();
        ArrayList<Kategori1841720126Ela> expResult = instance.getByNamaAndKeterangan(instance.getNama(), instance.getKeterangan());
        assertTrue(expResult.size()>0);
    }
    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720126Ela> result = instance.search(keyword);
        ArrayList<Kategori1841720126Ela> expResult = instance.getByNamaAndKeterangan(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}
