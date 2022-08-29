import java.util.*;

class program2
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the sizeof Array : ");
        int size=sobj.nextInt();
    }
}
abstract class ArrayX
{
    public int Arr[];

    public ArrayX(int size)
    {
        Arr=new int[size];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements : ");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Entered data is : ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]+" ");
        }
    }
}