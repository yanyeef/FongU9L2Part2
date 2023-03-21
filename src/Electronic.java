public class Electronic {
    private String name;
    private int yearGot;
    private int battery;

    public Electronic(String name, int yearGot, int battery){
        this.name = name;
        this.yearGot = yearGot;
        this.battery = battery;
    }

    public String getName(){
        return name;
    }
    public int getYearGot(){
        return yearGot;
    }
    public int getBattery(){
        return battery;
    }

    public void hoursUsed(){
        int h = (int)(Math.random()*24 +1;
        System.out.println("You used your phone for " + h + " hours");
    }

    public void playGames(){
        System.out.println("You played Tetris");
    }
}
