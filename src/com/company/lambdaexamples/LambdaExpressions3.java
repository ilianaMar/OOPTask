package com.company.lambdaexamples;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class LambdaExpressions3 {
    public static void main(String[] args) {
        List<Integer> intNumbers = Arrays.asList(100, 999, -9, 8, 80);
        List<Person> listPerson = Arrays.asList(
                new Person("Iliana Markova", 165),
                new Person("Test Testov", 200),
                new Person("LoremLoremLorem  LoremLoremLorem", 180)
        );
        List<Person> listPerson2 = new ArrayList<>();

        taskOne(intNumbers);
        addPersonNames(listPerson);
        getLongNameCharacter(listPerson);
        getLongNameCharacter(listPerson2);
        getHighestPerson(listPerson);
        getHighestPerson(listPerson2);
        getSquareNumbers(intNumbers);
    }


//1. Направете метод, който за List от Integer-и, да намира дали има число, което е трицифрено.

    public static void taskOne(List<Integer> listNumbers) {
        boolean isThreeDigits = listNumbers.stream().anyMatch(n -> (n >= 100 && n <= 999) || (n >= -999 && n <= -100));
        String message = (isThreeDigits) ? "There is three digits numbers" : "There aren't three digits numbers";
        System.out.println(message);
        listNumbers.forEach((n) -> {
            if (n >= 100 && n <= 999 || n >= -999 && n <= -100) {
                System.out.printf("3 digit number is %s%n", n);
            }
        });

    }
//2. Нека имаме клас Person и всеки Person да има име. Направете метод, който по List да създава списък с имената на хората.

    public static void addPersonNames(List<Person> personObjects) {
        List<String> personNames = personObjects.stream().map(Person::getName).collect(toList());
        System.out.println(personNames);
    }

// 3. Използвайки класа Person от задача 2, направете метод, който по List да
// връща дължината (броя на буквите) на този с най-дълго име.


    public static void getLongNameCharacter(List<Person> personObjects) {
        OptionalInt nameCharacters = personObjects.stream().map(Person::getName).mapToInt(String::length).max();
        if (nameCharacters.isPresent()) {
            String name = personObjects.stream().filter(person -> person.getName().length() == nameCharacters.getAsInt()).collect(toList()).get(0).getName();
            System.out.printf("Length of longest name is %s%n", nameCharacters.getAsInt());
            System.out.printf("The name is %s%n", name);
        } else {
            System.out.println("There aren't any persons!");
        }
    }

// 4. Нека Person има и височина. Направете метод, който да връща най-високия Person и му отпечатайте името в конзолата.

    public static void getHighestPerson(List<Person> personObjects) {

        Optional<Person> maxPersonHeight = personObjects
                .stream()
                .max(Comparator.comparing(Person::getHeight));

        String message = (maxPersonHeight.isPresent())
                ? String.format("The highest person is %s with %s%n",
                maxPersonHeight.get().getName(), maxPersonHeight.get().getHeight())
                : "There aren't any persons";

        System.out.println(message);
    }


    //5. Направете метод, който по списък от цели числа, да връща списък от корен квадратен на положителните числа в списъка.
    public static void getSquareNumbers(List<Integer> integers) {
        List<Double> numberList = new ArrayList<>();
        integers.stream().filter(i -> i > 0).forEach(n -> numberList.add(Math.sqrt(n)));
        System.out.println(numberList);
    }
}
