package tools.wpfang.simplecalc;

import android.util.Log;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalciTestClass {
    MainActivity mainActivity;

    @Before
    public void init()
    {
        mainActivity=new MainActivity();

    }
    @Test
    public void checkAddition()
    {
        int actualResult=mainActivity.doAddition(9,10);
        assertEquals(actualResult,19);
    }
    @Test
    public void checkSubtraction()
    {
        int actualResult=mainActivity.doSubtraction(10,3);
        assertEquals(actualResult,7);
    }
    @Test
    public void checkDivision()
    {
        int actualResult=mainActivity.doDivision(6,1);
        //Log.i("result",""+actualResult);
        assertEquals(actualResult,6);
    }
    @After
    public void donMethod()
    {
        mainActivity=null;
    }
}
