/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class DivideByZeroException extends Exception{
    DivideByZeroException(){
        super();
        System.out.println("Dividing by Zero!");
    }
    DivideByZeroException(String s){
        super(s);
    }
}