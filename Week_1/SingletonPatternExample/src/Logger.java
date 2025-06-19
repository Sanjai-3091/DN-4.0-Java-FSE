public class Logger {
    private static  volatile Logger instance ;
    private Logger(){
        System.out.println("Instance is created");
    }
    public static Logger getInstance(){

        if(instance==null)
        {
            synchronized (Logger.class) {
                instance = new Logger();
            }
        }
        return instance;
    }
    public void log(String message)
    {
        System.out.println("Log " + message);
    }


}
