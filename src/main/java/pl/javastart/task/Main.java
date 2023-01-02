package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ChristmasTree christmasTree1 = new ChristmasTree();
        ChristmasTree christmasTree2 = new ChristmasTree();

        christmasTree1.setHeight(185);
        christmasTree1.setType("sosna");
        christmasTree1.setBaublesAmount(25);

        christmasTree2.setHeight(160);
        christmasTree2.setType("jodła");
        christmasTree2.setBaublesAmount(23);

        System.out.println(christmasTree1);
        System.out.println(christmasTree2);
    }
}
