/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ing-0-0013
 */
public class cuboBeanTest {
    
    public cuboBeanTest() {
    }
    
    /**
     * Test of getTextoResultado method, of class cuboBean.
     */
    @Test
    public void testGetTextoResultado() {
        System.out.println("getTextoResultado");
        cuboBean instance = new cuboBean();
        String expResult = "";
        String result = instance.getTextoResultado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTextoResultado method, of class cuboBean.
     */
    @Test
    public void testSetTextoResultado() {
        System.out.println("setTextoResultado");
        String textoResultado = "resultado";
        cuboBean instance = new cuboBean();
        instance.setTextoResultado(textoResultado);
        assertEquals(instance.getTextoResultado(), textoResultado);
    }

    /**
     * Test of getTextoIngreso method, of class cuboBean.
     */
    @Test
    public void testGetTextoIngreso() {
        System.out.println("getTextoIngreso");
        cuboBean instance = new cuboBean();
        String expResult = "";
        String result = instance.getTextoIngreso();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTextoIngreso method, of class cuboBean.
     */
    @Test
    public void testSetTextoIngreso() {
        System.out.println("setTextoIngreso");
        String textoIngreso = "";
        cuboBean instance = new cuboBean();
        instance.setTextoIngreso(textoIngreso);
        assertEquals(instance.getTextoIngreso(), textoIngreso);
    }

    /**
     * Test of resolver method, of class cuboBean.
     */
    @Test
    public void testResolver() {
        System.out.println("resolver");
        cuboBean instance = new cuboBean();
        instance.setTextoIngreso(   "2\n" +
                                    "4 5\n" +
                                    "UPDATE 2 2 2 4\n" +
                                    "QUERY 1 1 1 3 3 3\n" +
                                    "UPDATE 1 1 1 23\n" +
                                    "QUERY 2 2 2 4 4 4\n" +
                                    "QUERY 1 1 1 3 3 3\n" +
                                    "2 4\n" +
                                    "UPDATE 2 2 2 1\n" +
                                    "QUERY 1 1 1 1 1 1\n" +
                                    "QUERY 1 1 1 2 2 2\n" +
                                    "QUERY 2 2 2 2 2 2");
        instance.resolver();
        String expResult =  "4\n" + 
                            "4\n"+
                            "27\n"+
                            "0\n"+
                            "1\n"+
                            "1\n";
        assertEquals(instance.getTextoResultado(), expResult);
    }
    
}
