//Given a array of numbers (integers), find second maximum and second minimum in this array

import java.util.*;

public class second_max_min
{
  public static void main(String []args)
 {
  int n,j=0,max,min,smax=0,smin=0;
  int flag=0;
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter size of array:");
  n = sc.nextInt();
  int arr[] = new int[n];
 for(int i=0;i<n;i++)
 {
   System.out.print("Enter element "+(i+1)+": ");
   arr[i]=sc.nextInt();
 }

System.out.println("The array is:");
 for(int i=0;i<n;i++)
  System.out.print(arr[i]+" ");
 System.out.println("");

 max=arr[0];
 min=arr[0];

 for(int i=1;i<n;i++)
  if(arr[i]<min)
   min=arr[i];

 for(int i=0;i<n;i++)
  if(arr[i]>max)
    max=arr[i];

for(int i=0;i<n;i++)
  if(arr[i]<max)
  {
   smax=arr[i];
   for(int k=0;k<n;k++)
     {
     if(arr[k]>smax&&arr[k]!=max)
      smax=arr[k];
     }
   }

for(int i=0;i<n;i++)
  if(arr[i]>min)
 {
   smin=arr[i];
   for(int k=0;k<n;k++)
   {
     if(arr[k]<smin&&arr[k]!=min)
      smin=arr[k];
   }
 }

 System.out.println("The Second Maximum is: "+smax);
 System.out.println("The Second Minimum is: "+smin);
}
}
