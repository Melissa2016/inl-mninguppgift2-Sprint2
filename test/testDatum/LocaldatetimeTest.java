/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDatum;

import inlämninguppgift22.Localdatetime;
import inlämninguppgift22.testDatum;
import java.time.LocalDate;
import junit.framework.TestCase;
import org.junit.Test;

public class LocaldatetimeTest {
      
    @Test
    
    
    public void localDatumTest()  {
     Localdatetime l = new Localdatetime();
    
     
        try{
         TestCase.assertTrue(l.Localdatetime().equals(LocalDate.now()) );
         TestCase.assertFalse( l.Localdatetime().equals("2018-10-22"));
        }
        catch(Exception e){
            //
        }}}
    

