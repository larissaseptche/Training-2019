package com.gestion.finance.domaine;
import com.gestion.finance.domain.Millitant;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class MillitantTest {
    private Millitant millitant;
    private static String MILLITANT_NAME = "awal";
    private static String MILLITANT_ID= "awa100l";
    private static String MILLITANT_LAST_NAME = "awa100l";
    private static LocalDate MILLITANT_DATE = LocalDate.now();
    private static String registerResponseExpected = "enregistrer avec succes";

    @Before
    public  void setUp(){
        this.millitant =  new Millitant(MILLITANT_NAME, MILLITANT_ID, MILLITANT_LAST_NAME, MILLITANT_DATE );
    }

    @Test
    public void givenValidMillitant_whenRegister_thenShouldbeRegister() {

        String registerResponseActual = this.millitant.registerMillitant();

        assertTrue(registerResponseActual.equalsIgnoreCase(registerResponseExpected));
    }
}
