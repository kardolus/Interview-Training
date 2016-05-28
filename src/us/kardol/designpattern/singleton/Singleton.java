package us.kardol.designpattern.singleton;

public class Singleton {
    public String singletonData = "";

    private static int instanceCounter = 0;
    private static Singleton instance = null;

    private Singleton(){ // make the constructor private

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    {
        instanceCounter++;
    }

    public int getValue(){
        return instanceCounter;
    }

    public String getSingletonData(){
        return singletonData;
    }
    public void setSingletonData(String singletonData){
        this.singletonData = singletonData;
    }
}
