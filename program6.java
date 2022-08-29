import java.util.*;
public class program6
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size=sobj.nextInt();

        int Arr[]=new int[size];

        System.out.println("Enter the Elements : ");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        Searching obj = new Searching();
        obj.Change(Arr);

        System.out.println("Enter the Elements after changing : ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
class Searching
{
    public void Change(int Arr[])
    {
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]++;
        }
    }
}