import java.util.*;

class program3
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size=sobj.nextInt();

        Searching obj = new Searching(size);

        obj.Accept();
        obj.Display();

        System.out.println("Enter the Number to be searched : ");
        int no=sobj.nextInt();

        boolean bRet=obj.Search(no);
        if(bRet==true)
        {
            System.out.println("Element is there");
        }
        else
        {
            System.out.println("Element is not there");
        }
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
       
    public abstract boolean Search(int no);
}

class Searching extends ArrayX
{
    public Searching(int size)
    {
        super(size);
    }

    public boolean Search(int no)
    {
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]==no)
            {
                break;
            }
        }
        if(i==Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}