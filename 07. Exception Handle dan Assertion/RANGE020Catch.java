/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/

class RANGE020Catch {
    public static void main(String[] args) {
        int i=Integer.parseInt(args[0]);
        try {
            assert i>0&&i<20;
            System.out.println("Anda masukkan "+i);
        } catch (AssertionError e) {
            System.out.println("Input out of Range");
        }
    }
}