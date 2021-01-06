/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class Prima {
    String primeNumbers;
    Prima(int n,int m){
        try{
            assert n>0;
            assert m>0;
            primeNumbers ="";
            for (int i = n; i <= m; i++) {
                int counter=0;
                for(int num =i; num>=1; num--){
                    if(i%num==0) {
                        counter = counter + 1;
                    }
                }
                if (counter ==2) {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
        }
        catch(AssertionError e){
            System.out.println("Input Number Invalid");
        }
    }
}