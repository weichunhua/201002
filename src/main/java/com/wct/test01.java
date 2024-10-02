package com.wct;

import com.wk.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author shkstart
 * @create 2021-05-23 11:14
 */
public class test01 {

    private static int a;
    private static int anInt;

    public static void main(String[] args) {
//
        int a = 5;
        boolean b = false;
        String str = "tgbyhn";


//        System.out.println("a = " + a);
//        System.out.println(a);
//        System.out.println("hello");
//        System.out.println("\"hello\" = " + "hello");


//        System.out.println(str);
//        str=String.format("Hi,%s", "小超脸");
//        str=String.format("Hi,%d %s %s", 55,"是个","大帅哥");
//        System.out.println(str);

//        BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
//        System.out.print("第一行 :");
//        String s1=sc.nextLine();
//        System.out.print("第二行 :");
//        String s2 =sc.nextLine();
//        System.out.print(s1+""+s2);


//        try {
//            System.out.println(stdin.readLine());
//        } catch (IOException e) {
//
//        }
//        new Random().ints(5)
//                .map(new IntUnaryOperator() {
//                    @Override
//                    public int applyAsInt(int operand) {
//                        return Math.abs(operand);
//                    }
//                })
//                .forEach(new IntConsumer() {
//                    @Override
//                    public void accept(int value) {
//                        System.out.println(value) ;
//                    }
//                });


//        new Random().ints(5)
//                .map(i->Math.abs(i))
//                .forEach(i -> System.out.println(i));
//        System.out.println(Math.abs(4));
//
//        new Random().ints(10)
//                .map(Math::abs)
//                .forEach(System.out::println);
//    }
//
//
//    List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
//    List<String> result = names.stream()
//            .filter(name -> name.startsWith("A"))
//            .collect(Collectors.toList());


//        System.out.println(System.currentTimeMillis());
//       Date date =new Date();
//        Calendar rightNow = Calendar.getInstance();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
//        System.out.println(date);
//        System.out.println(rightNow);

//        LocalDateTime ldt = new LocalDateTime.now();
//        System.out.println(ldt);

//        String person=new String("zhangzhaolaing");
//        Optional<String> optionalPerson=Optional.ofNullable(person);
//        optionalPerson.ifPresent((s) -> System.out.println(s));

//        System.out.println(optionalPerson.orElse(person));
//        System.out.println(optionalPerson.orElse(null));

//        Optional<Integer> optional1 = Optional.ofNullable(1);
//        Optional<Integer> optional2 = Optional.ofNullable(null);
//
//        System.out.println(optional1.orElse(2) == 1);//true
//
//        System.out.println(optional2.orElse(4) == 4);//true

        Optional<Integer> optional1 = Optional.ofNullable(1);

        Optional<Integer> filter1 = optional1.filter((c) -> {
            System.out.println("aaaaaa");
            return false;
        });
        System.out.println(filter1.isPresent());// false


    }
}