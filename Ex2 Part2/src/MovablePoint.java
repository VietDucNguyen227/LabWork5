public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    @Override
    public void moveUp() {
        y=y++;
    }

    @Override
    public void moveDown() {
        y=y--;
    }

    @Override
    public void moveLeft() {
        x=x++;
    }

    @Override
    public void moveRight() {
        x=x--;
    }
}




