import java.util.*;

class program1
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the sizeof Array : ");
        int size=sobj.nextInt();

        int Arr[]=new int[size];

        System.out.println("Enter the Elements : ");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        System.out.println("Entered data is : ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]+" ");
        }
    }
}
