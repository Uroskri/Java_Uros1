package day42_Exeptions;

import java.sql.Time;

class FadyException extends RuntimeException{
    public FadyException(String message){
        super(message);
    }
    public FadyException(){
        super(
                "Time for a short break");
    }
}
public class CUstomExeptions {
    public static void main(String[] args) {




        throw new FadyException();




    }
}
