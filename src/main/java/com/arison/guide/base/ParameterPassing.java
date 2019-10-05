package com.arison.guide.base;


import com.arison.guide.model.Student;

//值传递和引用传递
public class ParameterPassing {

    public static void main(String[] args) {
        testQuoteTypeAgain();
    }

    /**
     * 基本数据类型-值传递
     */
    public static void testBastType(){
        int num1 = 10;
        int num2 = 20;

        swap(num1, num2);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }


    /**
     * 引用数据类型
     */
    public static void testQuoteType(){
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void testQuoteTypeAgain(){
        Student s1 = new Student("小张");
        Student s2 = new Student("小李");

        swap(s1, s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }

    public static void change(int[] arr){
        arr[0]=0;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }




}
