import java.util.Scanner;

public class geneticChain {
    public static int x =0;
    public static int y =0;
    public static int size =0;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        size = input.nextInt();


        String[][] arr = new String[size][size];

        for(int i =0; i< arr.length;i++)
        {
            for (int y = 0; y <arr[i].length;y++)
            {
                arr[i][y] = " ";
                //System.out.printf(" %s ",arr[i][y]);
            }
            //System.out.println();
        }
        while (true)
        {
            right(arr,size);
            size=size-1;
            down(arr,size--);
            left(arr,--size);
            up(arr,--size);

            if(size <= 1)
                break;


        }

        for(int i =0; i< arr.length;i++)
        {
            System.out.printf("[");
            for (int y = 0; y <arr[i].length;y++)
            {
                //arr[i][y] = ""+i;
                System.out.printf(" %s ",arr[y][i]);
            }
            System.out.printf("]");
            System.out.println();
        }
    }
    public static String[][] right(String[][] arr, int num)
    {
        for (int i = 0; i<num || x < size; i++, x++)
        {
            arr[x][y] = "*";
        }
        x--;
        return arr;
    }
    public static String[][] down(String[][] arr, int num)
    {
        for (int i = 0; i<num || y < size ; i++)
        {
            //System.out.println(x+ " "+ y);
            arr[x][y] = "*";
            y++;
        }
        y--;
        return arr;
    }
    public static String[][] left(String[][] arr, int num)
    {
        for (int i = 0; i<num ; i++)
        {
            x--;
            arr[x][y] = "*";
        }
        return arr;
    }
    public static String[][] up(String[][] arr, int num)
    {
        for (int i = 0; i<num ; i++)
        {
            y--;
            arr[x][y] = "*";
        }
        return arr;
    }
}
