package src.com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Coyote Tango");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Japan");
        jaeger1.setHeight(85.34f);
        jaeger1.setWeight(7450f);
        jaeger1.setStrength(7);
        jaeger1.setArmor(4);

        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f, 6122f, 8, 6);

        String modelName1 = jaeger1.getModelName();
        System.out.println("Jaeger1 name is " + modelName1);

        String modelName2 = jaeger2.getModelName();
        System.out.println("Jaeger2 name is " + modelName2);
    }
}