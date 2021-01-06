import java.util.ArrayList;

class List {
    public static void main(String[] args) {
        int[] my_array = {1,2,5,5,5,6,6,7,7,8};
        int temp=-1;
        ArrayList<Integer> same=new ArrayList<Integer>(); 
        for(int i=0; i<my_array.length ;i++){
            for(int j=i+1; j<my_array.length; j++){
                if(my_array[i]==my_array[j]){
                    if(temp!=my_array[i]) same.add(0);
                    if(!same.contains(i)){
                        same.add(i);
                        temp=my_array[i];
                    }
                    if(!same.contains(j)){
                        same.add(j);
                        temp=my_array[j];
                    }
                }
            }
        }
        same.add(0);
        int i=0;
        if(same.get(i)==0) System.out.print("Same Index : ");
        while(i<same.size()-1){
            if(same.get(i)==0) System.out.print("\n");
            else{
                System.out.print(same.get(i)+" ");
                try{
                    if(same.get(i+2)==0) System.out.print("and ");
                }
                catch(IndexOutOfBoundsException e){}
            }
            i++;
        }      
    }
}