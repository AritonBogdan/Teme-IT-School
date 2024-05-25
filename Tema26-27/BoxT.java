public class BoxT<T> {
    private T item;

    // Method to set the item in the box
    public void setItem(T item) {
        this.item = item;
    }

    // Method to get the item from the box
    public T getItem() {
        return item;
    }
}
