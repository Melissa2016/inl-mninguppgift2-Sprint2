/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDatum;

import inlämninguppgift22.Insertinput;
import inlämninguppgift22.Localdatetime;
import java.time.LocalDate;
import junit.framework.TestCase;
import org.junit.Test;


public class InsertinputTest {
    
      @Test
    
    
    public void insertinputTest()  {
  Insertinput  l = new Insertinput ();
    
     
        try{
         TestCase.assertTrue(l.Insertinput ("9110261234, Liu Lingren").equals("9110261234, Liu Lingren") );
         TestCase.assertFalse( l.Insertinput ("9110261234,  Lingren").equals("9110261234, Liu Lingre"));
        }
        catch(Exception e){
            //
    
}}}
