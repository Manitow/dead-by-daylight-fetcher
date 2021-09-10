interface Movable {
    int getX();

    void setX(int newX);

    int getY();

    void setY(int newY);
}

interface Storable {
    int getInventoryLength();

    String getInventoryItem(int index);