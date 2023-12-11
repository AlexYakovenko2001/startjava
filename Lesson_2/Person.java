public class Person {
    //пол, имя, рост, вес, возраст
    String sex = "male";
    String name = "Ingvar";
    float height = 1.80f;
    float weight = 79.8f;
    int age = 24;
    //идти, сидеть, бежать, говорить, учить Java
    void makeMove()  {
        System.out.println(name + " идёт");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void speak() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + " учит Java");
    }
}