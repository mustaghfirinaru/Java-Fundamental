/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class CLA2{
    public static void main(String [] args){
        // int count=args.length;
        if (args.length>2){
            System.out.println("Error");
            System.exit(1);
        }
        else {
            int n=Integer.parseInt(args[0]);
            int m=Integer.parseInt(args[1]);
            System.out.println(n+" dan "+m);
            Prima foo = new Prima(n,m);
            System.out.println(foo.primeNumbers);
        }
    }
} 