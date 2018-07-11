package com.ys.maven;
 
import junit.framework.Assert;
import org.junit.Test;
 
public class HelloTest {
     
    @Test
    public void testHello(){
        HelloMaven he = new HelloMaven();
        String name = he.Hello("maven");
        //判断 Hello 传入的参数是否是 "maven"
        Assert.assertEquals("maven", name);
    }
 
}
