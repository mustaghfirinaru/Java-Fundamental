/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class NegativeNumberException extends Exception {
    NegativeNumberException(){
        super();
        System.out.println("Exception  Bilangan  Negative  !");
    }
    NegativeNumberException(String s){
        super(s);
    }
}