public class Point {
    protected int X ;
    protected int Y ;
    public Point(int myX,int myY){
        this.X = myX;
        this.Y = myY;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setX(int x) {
        this.X = x;
    }

    public void setY(int y) {
        this.Y = y;
    }
}