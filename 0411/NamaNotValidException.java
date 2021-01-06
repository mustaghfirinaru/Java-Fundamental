/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/

class NamaNotValidException extends Exception {
    NamaNotValidException(String nama){
        System.out.println("Nama Not Valid "+nama);
    }
}