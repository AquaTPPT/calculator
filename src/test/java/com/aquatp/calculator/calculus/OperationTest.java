package com.aquatp.calculator.calculus;

import com.aquatp.calculator.enums.Operations;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class OperationTest {

    //SUT
    private Operation operation;

    @Before
    public void setUp() {
        operation = new Operation();
    }

    @Test
    @Parameters
    public void checkIfTheNumbersListAddMethodIsWorkingAsIntended(double[] nums, String expected) {
        operation.addNumbers(nums);
        assertEquals(expected, operation.toString());
    }

    private Object[] parametersForCheckIfTheNumbersListAddMethodIsWorkingAsIntended() {
        return new Object[] {
            new Object[] {new double[] {2,3,5,7}, "2.0, 3.0, 5.0, 7.0."},
            new Object[] {new double[] {3,5,6,2}, "3.0, 5.0, 6.0, 2.0."},
            new Object[] {new double[] {2.3, 5.334, 4.554}, "2.3, 5.334, 4.554."},
            new Object[] {new double[] {1.2, -1.2, 0, 0}, "1.2, -1.2, 0.0, 0.0."}
        };
    }
}
