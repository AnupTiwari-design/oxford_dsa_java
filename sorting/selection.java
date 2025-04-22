package sorting;

public class selection {
    void selection_sort(int arr[],int n){
        for(int i=0;i<n;i++)
        {
            int m_i=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[m_i]){
                    m_i=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[m_i];
            arr[m_i]=temp;
        }




    }

    public static void main(String[] args) {
        

    }
    
}
