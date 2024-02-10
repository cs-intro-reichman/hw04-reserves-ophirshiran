public class ArrayOps {
    public static void main(String[] args) {
       //int[] arrNew={2,3,1};
       //System.out.println(findMissingInt(arrNew));
       // int[] arrNew={6,9,4,8,5,3};
       // System.out.println(secondMaxValue(arrNew));
       //int[] arrNew1={1,2,1,1,3,3};
       //int[] arrNew2={1,2,1,3};
       //System.out.println(containsTheSameElements(arrNew1,arrNew2));
      // int[] arrNew={5,1,1,-2};
       //System.out.println(isSorted(arrNew));
    }
    
    public static int findMissingInt (int [] array) {                          
        int[] arrNew=new int[array.length+1];
        for(int i=0; i < array.length; i++){        
                arrNew[array[i]]=array[i];
        }
        for(int j=0; j < arrNew.length; j++){              
            if(arrNew[j]!=arrNew[j+1]-1) {
                return arrNew[j]+1;
            }else return 0;
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int max=0;
        int nextMax=0;
        for(int i=0; i < array.length-1; i++){        
                 if(array[i]>=max){
                    max=array[i];
                }
        }
        for(int j=0; j < array.length; j++){
            if(array[j]>nextMax && array[j]<max){
                nextMax=array[j];
            }
        }
        return nextMax;
    }
    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean index=false;
        for(int i=0; i < Math.max(array1.length, array2.length); i++){ 
            index=false;
            for(int j=0; j < Math.min(array1.length, array2.length); j++)       
                if(array1[i]==array2[j]){
                   index=true;
                }
         }
         if (index==false) return false;
         else return true;
    }
    public static boolean isSorted(int [] array) {
       int countUp=0;
       int countDown=0;
        for(int i=0; i < array.length-1; i++){
            if(array[i]<=array[i+1]){
                countUp++;
            } 
            if (array[i]>=array[i+1]) {
                countDown++;
            } 
        }
        if (countUp==array.length-1 || countDown==array.length-1){
            return true;
        } else return false;
    }

}
