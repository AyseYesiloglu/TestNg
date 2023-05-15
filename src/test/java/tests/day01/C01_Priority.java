package tests.day01;

import org.testng.annotations.Test;

public class C01_Priority {

    /*
    küçük olan önceliklidir
    priority = 7
    priority = 10
    priority = -99


    depensOn metodunu diyorsam o test class'ı depensOn metodu olan class'ı ile birlikte çalışır.
    depensOn önündeki SADECE BİR TEST'İ çalıştırabilir

     */

    // testNg

    @Test(priority = 7)
    public void firstTest(){
        System.out.println("First Test is executed");

    }

    @Test(priority = 10)
    public void secondTest(){
        System.out.println("Second Test is executed");

    }

    @Test(priority = -99)
    public void thirdTest(){
        System.out.println("Third Test is executed");

    }
}
