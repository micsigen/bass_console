package hipercube.bass;

/**
 * Created by bmajor on 2017. 05. 02..
 */

public class Main {

    public static void main(String[] args){
        byte[] bytes = new byte[]{(byte)7, (byte)0, (byte)5, (byte)11, (byte)1, (byte)8, (byte)4, (byte)10, (byte)2, (byte)9, (byte)3, (byte)6};
        int n = bytes.length;
        permute(bytes, 0, n-1);
    }

    private static void permute(byte[] bytes, int l, int r)
    {
        if (l == r) {
            BitmapCreator bitmapCreator = new BitmapCreator(bytes);
            bitmapCreator.createBitmap();
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                bytes = swap(bytes,l,i);
                permute(bytes, l+1, r);
                bytes = swap(bytes,l,i);
            }
        }
    }

    private static byte[] swap(byte[] a, int i, int j)
    {
        byte temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

    private static void print(byte[] bytes) {
        for (int i = 0 ; i<bytes.length ; i++){
            System.out.print(bytes[i]);
        }
        System.out.println();
    }
}
