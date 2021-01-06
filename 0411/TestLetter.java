/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
class TestLetter {
    public static void main(String[] args) {
        try{
            char c=Character.toUpperCase(args[0].charAt(0));
            if(c=='A'||c=='I'||c=='U'||c=='E'||c=='O'){
                throw new VowelException(c);
            }
            else if(c=='X'){
                throw new ExitException(c); 
            }
            else if(c==' '){
                throw new BlankException(c); 
            }
            System.out.println(c+" detected"); 
        }
        catch(VowelException e){
        }
        catch(ExitException e){
        }
        catch(BlankException e){
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Blank char detected...");
            
        }
    }
}