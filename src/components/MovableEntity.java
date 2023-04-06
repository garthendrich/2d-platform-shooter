package components;

class MovableEntity extends Entity {
    private int movementSpeed;

    private int dx = 0;
    private int dy = 0;

    MovableEntity(int x, int y, int width, int height, int movementSpeed) {
        super(x, y, width, height);

        this.movementSpeed = movementSpeed;
    }

    public void moveLeft() {
        this.dx = -movementSpeed;
    }

    public void moveRight() {
        this.dx = movementSpeed;
    }

    public void stopHorizontalMovement() {
        this.dx = 0;
    }

    public void updatePosition() {
        x += dx;
        y += dy;
    }
}
