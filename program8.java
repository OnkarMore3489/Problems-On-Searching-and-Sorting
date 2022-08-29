import java.util.*;
class program8 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=sobj.nextInt();

        int Arr[]=new int[size];

        System.out.println("Enter the elements : ");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }

        sorting obj = new sorting();
        boolean bRet=obj.ChkSort(Arr);
        if(bRet==true)
        {
            System.out.println("data is sorted");
        }
        else
        {
            System.out.println("data is not sorted");
        }
    }    
}
class sorting
{
    public Boolean ChkSort(int Arr[])
    {
        int i=0,j=0;
        boolean bRet=false;
        for(i=0;i<Arr.length;i++)
        {
            for(j=i+1;j<Arr.length;j++)
            {
                if(Arr[i]>Arr[j])
                {
                    bRet=false;
                    break;
                }
                else
                {
                    bRet=true;
                }
            }
        }
        return bRet;
    }
}