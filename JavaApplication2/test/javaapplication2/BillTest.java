/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Prithvi Raj
 */
public class BillTest {
    
    public BillTest() {
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

    /**
     * Test of Bill method, of class Bill.
     */
    @Test
    public void testBill() {
        System.out.println("Bill");
        Bill instance = new Bill();
        instance.Bill();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTextFieldsToPanel method, of class Bill.
     */
    @Test
    public void testAddTextFieldsToPanel() {
        System.out.println("addTextFieldsToPanel");
        Integer value = null;
        JPanel textfieldContainerPanel = null;
        Bill instance = new Bill();
        instance.addTextFieldsToPanel(value, textfieldContainerPanel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Bill.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        JPanel textfieldContainerPanel = null;
        Bill instance = new Bill();
        instance.actionPerformed(ae, textfieldContainerPanel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
