/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Ing-0-0013
 */
public class CuboTest {
    
    public CuboTest() {
    }

    /**
     * Test of updateQuery method, of class Cubo.
     */
    @Test
    public void testUpdateQuery() {
        System.out.println("updateQuery");
        int x = 1;
        int y = 1;
        int z = 1;
        int w = 4;
        Cubo instance = new Cubo();
        instance.inicializarCubo(5);
        assertTrue(instance.updateQuery(x, y, z, w));
    }

    /**
     * Test of query method, of class Cubo.
     */
    @Test
    public void testQuery() {
        System.out.println("query");
        int x1 = 1;
        int x2 = 1;
        int x3 = 1;
        int y1 = 3;
        int y2 = 3;
        int y3 = 3;
        Cubo instance = new Cubo();
        instance.inicializarCubo(5);
        int expResult = 0;
        int result = instance.query(x1, x2, x3, y1, y2, y3);
        assertEquals(expResult, result);
    }

    /**
     * Test of inicializarCubo method, of class Cubo.
     */
    @Test
    public void testInicializarCubo() {
        System.out.println("inicializarCubo");
        int dimensiones = 0;
        Cubo instance = new Cubo();
        boolean expResult = true;
        boolean result = instance.inicializarCubo(dimensiones);
        assertEquals(expResult, result);
    }
    
}
