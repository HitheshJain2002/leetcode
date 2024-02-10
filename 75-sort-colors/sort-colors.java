class Solution {
    public int[] sortColors(int[] a) {
        int n=a.length;
        int temp=0;
    
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }

            }
        }
        return a;
    }
}