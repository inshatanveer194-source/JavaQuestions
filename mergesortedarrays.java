package arrays;

public class mergesortedarrays {
    public static void main(String[] args) {
        int [] a = {11, 32,42,71};
        int [] b = {26 , 54 ,69,81};
        int [] c = new int [a.length + b.length];
        int i = 0 ; 
        int j=0 ;
        int k=0;
        
        while(i <a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        for(int x = 0; x<c.length ; x++){
            System.out.print(c[x]+ " ");
        }
        
    }
}
