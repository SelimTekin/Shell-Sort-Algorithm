import java.nio.file.*;

public class bruteForceSort {
    public static void sort(int[] a) {
        for (int increment = a.length / 2; increment > 0; increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
           for (int i = increment; i < a.length; i++) {
              int temp = a[i];
              for (int j = i; j >= increment && a[j - increment] > temp; j -= increment){
                 a[j] = a[j - increment];
                 a[j - increment] = temp;
              }
           }
        }
        for(int i = 0; i < a.length ;i++){
            System.out.print(a[i] + ", ");
        }
     }
     public static String readFileAsString(String fileName)throws Exception
    {
        String num;
        num = new String(Files.readAllBytes(Paths.get(fileName)));
        return num;
    }
     public static void main(String args[]) throws Exception{
        String deger = readFileAsString("Sıralama verisi.txt");
        String[] degers = deger.split(",");
        int size = degers.length;
        int[] degerlerTablom = new int [size];
        for(int i = 0; i < size ;i++){
            degerlerTablom[i] = Integer.parseInt(degers[i].trim());
        }
       sort(degerlerTablom);
     }
}
