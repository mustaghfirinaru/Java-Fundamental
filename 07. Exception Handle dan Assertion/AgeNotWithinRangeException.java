/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class AgeNotWithinRangeException extends Exception{
    AgeNotWithinRangeException(int n){
        System.out.println("Umur Not Valid "+n);
    }
}