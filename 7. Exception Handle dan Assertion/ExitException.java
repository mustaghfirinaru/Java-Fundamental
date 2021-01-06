/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class ExitException extends Exception{
    ExitException(char c){
        System.out.println(c+" detected,...exit anyway");
    }
}