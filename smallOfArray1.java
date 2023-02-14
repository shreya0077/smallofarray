import java.util.Scanner;
class smallOfArray1
{
        public static void main(String args[]){

             int a[]=new int[5]; int small;
             Scanner r=new Scanner(System.in);
             System.out.println("Enter num of Elementsin array");
             for(int i=0;i<a.length;i++)
             {
                   a[i]=r.nextInt();
             }
             small=a[0];
             for(int i=1;i<a.length;i++)
             {
                 if(a[i]<small)
                 {
                      small=a[i];
                 }
             }
             System.out.println("Smallest Element"+small);


        }
}

