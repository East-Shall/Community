package coder;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class test {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("try new SDK 17.");
    }
//    public static void show(Action act) {
//        act.command(Action.EAT);
//        act.command(Action.WORK);
//        act.command(Action.SLEEP);
//    }

//    public static void add(A a) {
//        // a = new A();
//        a.i++;
//    }
}

//class TreeSetTest {
//    public static void main(String[] args) {
//        TreeSet tree = new TreeSet();
//        tree.add(45);
//        tree.add(32);
//        tree.add(68);
//        tree.add(12);
//        tree.add(20);
//        tree.add(80);
//        tree.add(75);
//        System.out.println("集合元素个数：" + tree.size());
//        System.out.println("---集合中的元素---");
//        Iterator iter = tree.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }
//        System.out.println();
//        System.out.println("---集合中20～68 的元素---");
//        SortedSet s = tree.subSet(20, 68);
//        iter = s.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }
//        System.out.println();
//        System.out.println("---集合中45 之前的元素---");
//        SortedSet s1 = tree.headSet(45);// 包括45
//        iter = s1.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }
//        System.out.println();
//        System.out.println("---集合中45 之后的元素---");
//        SortedSet s2 = tree.tailSet(45); // 不包括45
//        iter = s2.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }
//        System.out.println();
//        System.out.println("集合中第一个元素：" + tree.first());
//        System.out.println("集合中最后一个元素：" + tree.last());
//        System.out.println("获取并移出集合中第一个元素：" + tree.pollFirst());
//        System.out.println("获取并移出集合中最后一个元素：" + tree.pollLast());
//        System.out.println("---集合中的元素---");
//        iter = tree.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }
//        System.out.println();
//    }
//}

//abstract class Action {// 定义一个抽象行为类
//    // 定义常量，表示不同的行为
//    public static final int EAT = 1;
//    public static final int SLEEP = 2;
//    public static final int WORK = 5;
//    // 定义不同行为的抽象方法
//    public abstract void eat();
//    public abstract void sleep();
//    public abstract void work();
//    public void command(int flags) {
//        switch (flags) {
//            case EAT:
//                this.eat();
//                break;
//
//            case SLEEP:
//                this.sleep();
//                break;
//            case WORK:
//                this.work();
//                break;
//            case EAT + SLEEP:
//                this.eat();
//                this.sleep();
//                break;
//            case SLEEP + WORK:
//                this.sleep();
//                this.work();
//                break;
//            default:
//                break;
//        }
//    }
//}
//
//class Robot extends Action {// 定义一个类Robot 继承类Action
//    // 实现抽象方法
//    public void eat() {
//        System.out.println("机器人充电");
//    }
//    public void sleep() {
//        System.out.println("机器人关机");
//    }
//    public void work() {
//        System.out.println("机器人工作");
//    }
//}
//
//class Human extends Action {// 定义一个类Human 继承类Action
//    // 实现抽象方法
//    public void eat() {
//        System.out.println("人吃饭");
//    }
//    public void sleep() {
//        System.out.println("人睡觉");
//    }
//    public void work() {
//        System.out.println("人工作");
//    }
//}
//class Cat extends Action {
//    // 定义一个类Cat 继承类Action
//    // 实现抽象方法
//    public void eat() {
//        System.out.println("猫吃食");
//    }
//    public void sleep() {
//        System.out.println("猫打盹");
//    }
//    public void work() {
//        System.out.println("猫逮老鼠");
//    }
//}


//class Test {
//    private void internalTracking(boolean b) {
//        if (b) {
//            class TrackingSlip {
//                private final String id;
//
//                TrackingSlip(String s) {
//                    id = s;
//                }
//                String getSlip() {
//                    return id;
//                }
//            }
//            TrackingSlip ts = new TrackingSlip("Shaw");
//            String string = ts.getSlip();
//            System.out.println(string);
//        }
//    }
//    public void track() {
//        internalTracking(trim.in.nextBoolean());
//    }
//    public static void main(String[] args) {
//        Test t1 = new Test();
//        t1.track();
//    }
//}

//class A {
//    private interface D {//类内部嵌套接口
//        void f();
//    }
//    private class DImp implements D {//接口的内部实现
//        public void f() {
//            System.out.println("这是内部接口的第一种实现。");
//        }
//    }
//    public class DImp2 implements D {
//        public void f() {
//            System.out.println("这是内部接口的第二种实现");
//        }
//    }
//    public D getD1(){
//        return new DImp();
//    }
//    public D getD2() {
//        return new DImp2();
//    }
//    private D dRef;
//    public void receiveD(D d) {//内部调用
//        dRef = d;
//        dRef.f();
//    }
//}

interface InterfaceNew {
    public double method();

    public default void test() {//接口默认方法
        System.out.print("Java 8的新特性。");
    }
}

class OuterC {
    int mount = 0;

    public void showC() {
        System.out.println("这是外部类");
    }

    public class InnerC {
        int mount = 5;

        public void showC() {
            System.out.println("这是内部类");
            System.out.println("外部mount=" + mount);
        }
    }
}

class Shape {
    protected String name;

    /*public Shape() {
        name = "shape";
    }*/

    public Shape(String name) {
        this.name = name;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle() {
        super("圆");
        radius = 0;
    }

    public Circle(double radius) {
        super("圆");
        this.radius = radius;
    }

    public Circle(double radius, String name) {
        super("圆");
        this.radius = radius;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }
}

//class A { // 定义一个类(利用对象来实现引用，传地址)
//    int i = 0;
//}

class Person {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private String name;
    private int age;
    private float weight;

}


//
//class Animal{	//父类
//    public void Eat() {	//成员方法
//        System.out.println("所有动物的父类，eat");
//    }
//}
//
//class Dog extends Animal{//子类继承父类
//    public void Eat() {//重写父类Eat方法
//        System.out.println("子类Dog重写父类Eat方法，eat");
//    }
//
//    public void Fly() {//新增子类方法
//        System.out.println("Dog类新增的方法，Fly");
//    }
//}
//
//class Hern {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Animal hern = new Dog();
//        hern.Eat();	//调用子类的方法
//        Dog hern1 = (Dog)hern;//向下转型
//        hern1.Eat();	//调用子类方法
//        hern1.Fly();
//
//		/*运行结果是：
//		       子类Dog重写父类Eat方法，eat
//			子类Dog重写父类Eat方法，eat
//			Dog类新增的方法，Fly
//		 */
//
//    }
//
//}

