public class Formula {
    public static void main(String[] args) {
        Point first =new Point(3 , 4);
        Point second =new Point(0 , 0);
        System.out.println(Math.sqrt(Math.pow((second.getX()-first.getX()),2.0)
                         + Math.pow(second.getY()-first.getY(),2.0)));

    }
}
