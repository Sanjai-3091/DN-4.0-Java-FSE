public class Main {
    public static void main(String[] args){
        Logger log1=Logger.getInstance();
        Logger log2=Logger.getInstance();
        log1.log("Log1 is created");
        log2.log("Log2 is created");
        if(log1==log2)
        {
            System.out.println("Both log1 and log 2 has same instance");
        }
        else {
            System.out.println("Different logger are exist");
        }
    }

}