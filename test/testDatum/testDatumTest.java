/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDatum;
import inlämninguppgift22.Inlämninguppgift22;
import inlämninguppgift22.testDatum;
import java.text.ParseException;
import java.time.LocalDate;
import junit.framework.TestCase;
import org.junit.Test;

public class testDatumTest {
    
    LocalDate testDateNow = LocalDate.now();
    LocalDate testDateOneMonthAgo = LocalDate.now().minusDays(3);
    
    LocalDate l = LocalDate.of(2017, 10, 1);
    LocalDate l2 = LocalDate.of(2017, 10, 3);
    
    @Test
    
    
    public void testDatumTest()  {
     testDatum gd = new testDatum();
    
     
        try{
         TestCase.assertTrue(gd.testDatum(l.toString(), l2) == 2);
         TestCase.assertFalse( gd.testDatum(l.toString(), l2)==5);
        }
        catch(Exception e){
            //
        }
       
        
    }}

 
   
      // TestCase.assertTrue(t.);
    
    
    