public class Computer extends Electronic{

    private boolean isCoding;
    public Computer(String name, int yearGot, int battery, boolean isCoding){
        super(name, yearGot, battery);
        this.isCoding = isCoding;
    }

    public void code(){
        System.out.println("You are coding using Java");
    }

    public boolean getIsCoding(){
        return  isCoding;
    }
}
