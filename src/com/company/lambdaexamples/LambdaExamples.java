package com.company.lambdaexamples;

import java.util.ArrayList;
import java.util.List;

interface Sayable{
    String say();
}

interface Sayable1{
    String say(String name);
}

interface Addable{
    int add(int a,int b);
}


public class LambdaExamples {
    public static void main(String[] args) {
        lambdaWithoutParameters();
        lambdaWithOneParameter("Iliana Markova");
        lambdaWithOneParameter("Test Name");
        lambdaWithTwoParameters(90, 10);
        lambdaWithTwoParameters1(4, 9);
        getArrayList();
        LambdaExamples lambdaExamples = new LambdaExamples();
        Sayable sayable = lambdaExamples::saySomething;
        System.out.println(sayable.say());
        Sayable sayable2 = new LambdaExamples()::saySomething; // You can use anonymous object also
        System.out.println(sayable2.say());
    }

    public static void lambdaWithoutParameters(){
        Sayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }

    public static void lambdaWithOneParameter(String name){
        Sayable1 s1=(nm)->{
            return "Hello, " + nm;
        };
        System.out.println(s1.say(name));
    }

    public static void lambdaWithTwoParameters(int a, int b){
        Addable ad1=(c,d)->(c+d);
        System.out.println(ad1.add(a,b));
    }

    public static void lambdaWithTwoParameters1(int x, int y){
        Addable ad2=(int a,int b)->{ return  (a+b);};
        System.out.println(ad2.add(x, y));
    }

    public static void getArrayList(){
        List<String> list = new ArrayList<String>();
        list.add("test");
        list.add("api");
        list.add("ui");
        list.forEach(System.out::println);
    }

    public String saySomething(){
        return "Hello, this is non-static method.";
    }
}
