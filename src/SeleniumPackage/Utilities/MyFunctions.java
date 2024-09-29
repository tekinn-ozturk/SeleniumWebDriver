package SeleniumPackage.Utilities;

public class MyFunctions {
    public static void Wait(int second){

        try{
            Thread.sleep(1000*second);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
