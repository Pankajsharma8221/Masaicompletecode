package q2;

public class InvalidMobileException extends Exception{
    public InvalidMobileException(String errorPopUp){
        super(errorPopUp);
    }
    public InvalidMobileException(){
    }
}