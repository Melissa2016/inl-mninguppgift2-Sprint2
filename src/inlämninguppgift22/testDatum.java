/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämninguppgift22;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class testDatum {

//att ta det datumet som kunden har köpt årskortet
public  Long testDatum(String input, LocalDate endtDate ) throws ParseException {

        LocalDate startDate = LocalDate.parse(input);
        //LocalDate endtDate = LocalDate.now();
        Long days = ChronoUnit.DAYS.between(startDate, endtDate);
        return (days);

    }

}
