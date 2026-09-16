public class TestMultipleCatch {
    public static void main(String[]args){
        try{
            int[] vivaanScore = new int[3];
            vivaanScore[0]=95;
            vivaanScore[1]=90;
            vivaanScore[2]=85;

            vivaanScore[5]=100;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Error occured.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Eror ; vavan handler :" + e);
        }
        catch(Exception e){
            System.out.println("general Exception Handler :" + e);
        }      
    }
}