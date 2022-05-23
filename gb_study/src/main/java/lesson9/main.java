package lesson9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {

        //Базовый способ создания Stream
        List<String> list = new ArrayList<>(Arrays.asList("A", "aa", "b"));
        Stream<String> stream = list.stream();

        //Способ создания Stream без первичных коллекций
        Stream<String> streamOf = Stream.of("A", "aa", "b", "A");

        // Создание Stream типа Integer
        IntStream streamInt = IntStream.of(1, 2, 3, 4, 5);

//        for (String s : list){
//            System.out.println(s);
//        }

        // Перевод Stream в Set
        Set<String> setStream = streamOf
                .collect(Collectors.toSet());
        // Перевод Stream в List
//        List<String> listStream = streamOf
//                .distinct()
//                .collect(Collectors.toList());
        // Вычисление средней длинны слова
//        Double averageStream = streamOf
//                .distinct()
//                .collect(Collectors.averagingInt(String::length));

        // Поиск максимального значения Stram
        streamInt.reduce(((i, i1) -> i > i1 ? i : i1))
                .ifPresent(System.out::println);
        // Поиск максимального значения Stram
//        streamInt.reduce(((i, i1) -> {
//                                        if (i > i1) {
//                                            return i;
//                                        } else {
//                                            return i1;
//                                        }
//                        })).ifPresent(System.out::println);
        // Поиск максимального значения Stram
//        streamInt.reduce((Math::max))
//                .ifPresent(System.out::println);

        Stream.of("dd2","aa2","bb1", "bb3","cc4")
                .map(s -> {
                    System.out.println("Upper " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("Filter " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("Result " + s));

        // оптимизация при помощи правильного расположения шагов
        Stream.of("dd2","aa2","bb1", "bb3","cc4")
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(s-> System.out.println("Result " + s));

    }
}

