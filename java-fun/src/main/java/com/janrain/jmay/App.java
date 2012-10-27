package com.janrain.jmay;

import com.janrain.jmay.fungroovy.Fun;
import com.janrain.jmay.fungroovy.IFun;

/**
 * Hello world!
 *
 */
public class App implements IFun
{
    public static void main( String[] args )
    {
        Fun fun = new Fun();
        System.out.println( "Hello World!" );
    }

    @Override
    public String getPoop(String tinkle) {
        return tinkle;
    }
}
