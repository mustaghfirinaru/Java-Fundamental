/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class CLA{
    public static void main(String [] args){
        int count=args.length;
        System.out.println("jumlah total argumen : "+count);
        for (int i=0;i<args.length;i++){
            System.out.println("Argumen "+i+": "+args[i]);
        }
    }
}