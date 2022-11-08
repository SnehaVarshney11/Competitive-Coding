package November;

import java.util.Arrays;

class TwoNumbers {
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        int arr[]=new int[2];

        int count=1;

        int k=0;

        Arrays.sort(Arr);

        for(int i=0;i<Arr.length;i++){

            

            if(i==Arr.length-1){

               if(Arr[i]==Arr[i-1]){

                    if(count%2==0){

                       count=1;

                    }else if(count%2!=0){

                        arr[k]=Arr[i];

                        k++;

                        count=1;

                    }

               }else{

                   arr[k]=Arr[i];

                        k++;

                        count=1;

               }

            }else if(Arr[i]==Arr[i+1]){

                count++;

            }else{

                if(count%2==0){

                    count=1;

                }else if(count%2!=0){

                    arr[k]=Arr[i];

                    k++;

                    count=1;

                }

            }

        }

        if(arr[0]<arr[1]){

            int temp=arr[1];

            arr[1]=arr[0];

            arr[0]=temp;

        }

        return arr;
    }
}
