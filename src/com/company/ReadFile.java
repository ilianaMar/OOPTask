package com.company;
import java.io.*;

public class ReadFile {
    public static void main(String[] args){
        try(
                FileReader firstFile = new FileReader("/Users/ilianamarkova/Projects/OOP_Task/support/test");
                FileReader secondFile = new FileReader("test")
        ) {
            int i,j ;
            while((i = firstFile.read()) != -1){
                System.out.println((char)i);
            }

            while((j = secondFile.read()) != -1){
                System.out.println((char)j);
            }

        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
