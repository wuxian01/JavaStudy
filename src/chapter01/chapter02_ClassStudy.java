package chapter01;

public class chapter02_ClassStudy {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);

        Child child = new Child();
        test(child);

        //多态
        Student student2 = new Child();
        test(student2); // 真正调用第一个test
    }


    static void test(Student s){
        System.out.println(s.name);
    }
    static void test(Child c){
        System.out.println(c.sex);
    }
}

class Student {
    String name;
    Student(){
        this("zhangsan");
    }
    Student(String name) {
        this.name = name;
    }
}

class Child extends Student {
    String sex;
    Child(){}
}