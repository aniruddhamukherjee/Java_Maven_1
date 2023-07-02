package exception;

public class Code1 {

    public static void calc() throws CustomException{
        try{
        //int a = 5/0;
         String s  = null;
         s.charAt(0);
        } catch(Exception e){
        // e.printStackTrace();
            throw new CustomException(101, "Some error occurred, try again later : Reason ->>" + e.getMessage());

        }
    }

}
