package com.ys.maven;
 
import junit.framework.Assert;
import org.junit.Test;
 
public class HelloTest {
     
    @Test
    public void testHello(){
        HelloMaven he = new HelloMaven();
        String name = he.Hello("maven");
        //�ж� Hello ����Ĳ����Ƿ��� "maven"
        Assert.assertEquals("maven", name);
    }
 
}
