package season_2.XoaPhanTuKhoiMang;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Nhap so phan tu cua mang: ");
        int sizeArr = sc.nextInt();
        int arr[] = new int [sizeArr];
        for (int i=0; i<sizeArr;i++){
            System.out.printf("arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        int index = 0;
        System.out.printf("Nhap so can xoa: ");
        int value = sc.nextInt();
        for (int i=0; i<sizeArr;i++){
            if (arr[i] == value){
                index = i;
                break;
            }
        }

        if (index!=0){
            for (int i=index;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
        }
        System.out.printf("Mang sau khi xoa la: ");
        for (int i=0; i<arr.length-1;i++){
            System.out.printf("\narr["+i+"]:"+arr[i]);
        }
    }
}
