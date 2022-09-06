package exercises.technology;

public class Computer {
private int storage;
private int ram;
private boolean hasCamera;

    public Computer (int storage, int ram, boolean hasCamera) {
        this.storage = storage;
        this.ram = ram;
        this.hasCamera = hasCamera;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }
    public void increaseRAM(int n){
        this.ram = this.ram + n;
    }
    public void increaseStorage(int j){
        this.storage = this.storage  + j;

    }
}
