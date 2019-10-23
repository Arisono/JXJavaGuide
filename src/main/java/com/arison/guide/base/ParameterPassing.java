package com.arison.guide.base;


import com.arison.guide.model.Point;
import com.arison.guide.model.Student;


import java.util.ArrayList;
import java.util.Collection;

//值传递和引用传递
public class ParameterPassing {

    public static void main(String[] args) {
        run01();
    }

    /**
     *
     */
    public static void run01(){
        int a=1;
        String b="hello";
        Point p=new Point(a,2);
        Collection c=new ArrayList();
        c.add(p);
        test01(a,b,p,c);

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("p:"+p.toString());
        System.out.println("c:"+c.toString());
    }

    public static void test01(int a, String b, Point p, Collection c){
        a=a+1;
        b=b+"world";
        p.setX(3);

        p=new Point(5,6);
        p.setX(7);

        c.clear();;
        c.add(p);

        c=new ArrayList();
        c.add(new Point(9,0));

        p.setX(a);
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
