package org.example;

public class EnumRunner
{
    public static void main( String[] args )
    {
        SingletonEnum singltonEnum = SingletonEnum.INSTANCE;
        System.out.println(singltonEnum.getValue());
        singltonEnum.setValue(555);
        System.out.println(singltonEnum.getValue());
    }
}
