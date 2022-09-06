package exercises.technology;

public class Smartphone extends Computer{
    private int numOfApps;


    public Smartphone(int storage, int ram, boolean hasCamera, int numOfApps) {
        super(storage, ram, hasCamera);
        this.numOfApps= numOfApps;

    }
    public void addApp(){
        this.numOfApps = this.numOfApps + 1;
    }
    public void removeApp(){
        this.numOfApps = this.numOfApps - 1;
    }

    public int getNumOfApps() {
        return numOfApps;
    }
}
