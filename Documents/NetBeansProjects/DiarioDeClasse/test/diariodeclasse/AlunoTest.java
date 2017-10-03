/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diariodeclasse;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex.freitag
 */
public class AlunoTest {
    private Aluno aluno;
    public AlunoTest() {
        aluno = new Aluno ("Alex", 1234, "29/02/2000");
    }

    /**
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        
        String expResult = "Alex";
        String result = aluno.getNome();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getMatricula method, of class Aluno.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        
        int expResult = 1234;
        int result = aluno.getMatricula();
        assertEquals(expResult, result);
        System.out.println(result);
    }

    /**
     * Test of getdataNascimento method, of class Aluno.
     */
    @Test
    public void testGetdataNascimento() {
        System.out.println("getdataNascimento");
        
        String expResult = "29/02/2000";
        String result = aluno.getdataNascimento();
        assertEquals(expResult, result);
       
    }
    
}
