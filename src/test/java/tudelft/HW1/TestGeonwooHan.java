package tudelft.HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGeonwooHan {
    @Test
    public void getFull(){
        String name = new GeonwooHan().getFullName();
        Assertions.assertEquals("Geonwoo Han",name);
    }

    @Test
    public void getFirst(){
        String name = new GeonwooHan().getFirstName();
        Assertions.assertEquals("Geonwoo", name);
    }

    @Test
    public void getLast(){
        String name = new GeonwooHan().getLastName();
        Assertions.assertEquals("Han", name);
    }

    @Test
    public void getUCInetID(){
        String id = new GeonwooHan().getUCInetID();
        Assertions.assertEquals("geonwooh", id);
    }

    @Test
    public void getStudentNumber(){
        int num = new GeonwooHan().getStudentNumber();
        Assertions.assertEquals(38661789,num);
    }

    @Test
    public void getRotatedFullNameL(){
        String name = new GeonwooHan().getRotatedFullName(2);
        Assertions.assertEquals("onwoo HanGe", name);
    }

    @Test
    public void getRotatedFullNameR(){
        String name = new GeonwooHan().getRotatedFullName(-5);
        Assertions.assertEquals("o HanGeonwo", name);
    }

}
