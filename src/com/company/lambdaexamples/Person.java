package com.company.lambdaexamples;
import java.util.*;

public class Person {
    String name;
    int height;


   public Person(String personName, int personHeight){
       this.name = personName;
       this.height = personHeight;
   }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
