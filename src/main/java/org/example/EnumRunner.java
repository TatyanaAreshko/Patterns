package org.example;

public class EnumRunner
{
    public static void main( String[] args )
    {
        SingltonEnum singltonEnum = SingltonEnum.INSTANCE;
        System.out.println(singltonEnum.getValue());
        singltonEnum.setValue(555);
        System.out.println(singltonEnum.getValue());
    }
}
