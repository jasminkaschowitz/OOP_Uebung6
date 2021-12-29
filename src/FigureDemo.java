public class FigureDemo {

    public static void main(String[] args) {
        FigureManager test1 = new FigureManager();
        Rectangle rectangle1 = new Rectangle(30, 50);
        Circle circle1 = new Circle(30.5);
        Rectangle rectangle2 = new Rectangle(80, 20);
        Rectangle rectangle3 = new Rectangle(10, 60);
        Circle circle2 = new Circle(50);
        Circle circle3 = new Circle(60);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle3.getArea());
        System.out.println(rectangle3.getPerimeter());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());
        System.out.println(circle3.getArea());
        System.out.println(circle3.getPerimeter());

        System.out.println("-----------------");

        test1.add(rectangle1);
        test1.add(circle1);
        test1.add(rectangle2);
        test1.add(rectangle3);
        test1.add(circle2);
        test1.add(circle3);

        System.out.println(test1.getMaxPerimeter());
        System.out.println(test1.getAverageAreaSize());
        System.out.println(test1.getAreaBySizeCategories());

    }
}
