package com.company.lambdaexamples;

import java.util.*;

public class LambdaExpressions3 {
    public static void main(String[] args) {
        List<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(100);
        intNumbers.add(-999);
        intNumbers.add(-9);
        intNumbers.add(8);
        intNumbers.add(80);
        taskOne(intNumbers);
        Person firstPerson = new Person("Iliana Markova", 165);
        Person secondPerson = new Person("Test Testov", 180);
        Person thirdPerson = new Person("LoremLoremLorem  LoremLoremLorem", 155);
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(firstPerson);
        listPerson.add(secondPerson);
        listPerson.add(thirdPerson);
        addPersonNames(listPerson);
        getLongNameCharacter(listPerson);
        getHighestPerson(listPerson);
        getSquareNumbers(intNumbers);
    }


//1. Направете метод, който за List от Integer-и, да намира дали има число, което е трицифрено.

    public static void taskOne(List<Integer> listNumbers) {
        listNumbers.forEach((n) -> {
            if (n >= 100 && n <= 999 || n >= -999 && n <= -100) {
                System.out.println(String.format("3 digit number is %s", n));
            }
        });

    }
//2. Нека имаме клас Person и всеки Person да има име. Направете метод, който по List да създава списък с имената на хората.

    public static void addPersonNames(List<Person> personObjects) {
        List<String> personNames = new ArrayList<>();
        personObjects.forEach(person -> personNames.add(person.getName()));
        System.out.println(personNames);
    }


// 3. Използвайки класа Person от задача 2, направете метод, който по List да
// връща дължината (броя на буквите) на този с най-дълго име.


    public static void getLongNameCharacter(List<Person> personObjects) {
        List<String> personNames = new ArrayList<>();
        personObjects.forEach(person ->
            personNames.add(person.getName())
        );

        int largestString = personNames.get(0).length();
        int index = 0;

        for (int i = 0; i < personNames.size(); i++) {
            if (personNames.get(i).length() > largestString) {
                largestString = personNames.get(i).length();
                index = i;
            }
        }

        System.out.println(String.format("%s is the largest name with size %s", personNames.get(index), largestString));
    }

// 4. Нека Person има и височина. Направете метод, който да връща най-високия Person и му отпечатайте името в конзолата.

    public static void getHighestPerson(List<Person> personObjects) {

        Person maxPersonHeight = personObjects
                .stream()
                .max(Comparator.comparing(Person::getHeight))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(String.format("The highest person is %s with %s",
                maxPersonHeight.getName(), maxPersonHeight.getHeight()));
    }


    //5. Направете метод, който по списък от цели числа, да връща списък от корен квадратен на положителните числа в списъка.
    public static void getSquareNumbers(List<Integer> integers) {
        List<Double> numberList = new ArrayList<>();
        integers.stream().filter(i -> i > 0).forEach(n -> numberList.add(Math.sqrt(n)));
        System.out.println(numberList);
    }
}
