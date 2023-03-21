public class Phone extends Electronic {
    private boolean hasCalled;
    private boolean hasTexted;


    public Phone (String name, int yearGot, int battery, boolean hasCalled, boolean hasTexted){
        super(name, yearGot, battery);
        this.hasCalled = hasCalled;
        this.hasTexted = hasTexted;
    }

    public void call(){
        System.out.println("You called your friend today");
    }

    public void message(){
        System.out.println("Your have 5 messages to respond to");
    }

    public boolean getHasCalled(){
        return hasCalled;
    }

    public boolean getHasTexted(){
        return hasTexted;
    }
}
