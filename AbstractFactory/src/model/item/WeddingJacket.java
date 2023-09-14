package model.item;

public class WeddingJacket implements Jacket{
    float size;
    @Override
    public boolean isFit(int personSize) {
        return !(personSize > size) && !(personSize < size);
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
