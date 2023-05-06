/**
 * Introduction to Programming
 * @author                        Team1 - DCBA
 *         Aldo Sunan Fudia		-   2602233260
 *         M. Ilmi Nasrulloh            -   2602233235
 *         Muliando Marpaung	        -   2602233393
 *         Nurul Amalia                 -   2602243993
 *         Saur Parlindungan Situmeang	-   2602239056
 */

import java.util.Scanner;
import java.util.Random;

public class ProgramSimulasi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[5];
        boolean exit = false;
        
        while(!exit) {
            System.out.println("----------------------------------");
            System.out.println("Selamat Datang di Program Simulasi");
            System.out.println("Menu:");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort – Ascending");
            System.out.println("4. Simulasi Bubble Sort – Descending");
            System.out.println("5. Simulasi Selection Sort – Descending");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");
            
            int choice = scanner.nextInt();
            
            switch(choice) {
                
                // Menu 1
                case 1:
                    System.out.print("Masukkan batas bawah: ");
                    int min = scanner.nextInt();
                    System.out.print("Masukkan batas atas: ");
                    int max = scanner.nextInt();
                    Random random = new Random();
                    for (int i = 0; i < 5; i++) {
                        data[i] = random.nextInt(max - min + 1) + min;
                    }
                    printData(data);
                    System.out.println();
                    break;
                // Menu 1 Selesai
                    
                // Menu 2
                case 2:
                    System.out.println("Bubble Sort - Ascending");
                    break;
                    
                // Menu 3
                case 3:
                    System.out.println("Selection Sort - Ascending");
                    System.out.println("Array sebelum diurutkan: ");
                    for (int i = 0; i < data.length; i++) {
                       System.out.print(data[i] + " ");
                    }
                    System.out.println();
                    int temp, minIndex;
                    for (int i = 0; i < data.length - 1; i++) {
                       minIndex = i;
                       for (int j = i + 1; j < data.length; j++) {
                          if (data[j] < data[minIndex]) {
                             minIndex = j;
                          }
                       }
                       
                       temp = data[i];
                       data[i] = data[minIndex];
                       data[minIndex] = temp;
              
                       System.out.println("\nArray setelah putaran " + (i+1) + ":");
                       for (int k = 0; k < data.length; k++) {
                          System.out.print(data[k] + " ");
                       }
                    }
              
                    System.out.println("\n\nArray setelah diurutkan secara ascending: ");
                    for (int i = 0; i < data.length; i++) {
                       System.out.print(data[i] + " ");
                    }
                    System.out.println();
                    break;
                
                // Menu 4
                case 4:
                    System.out.println("Bubble Sort - Descending");
                    break;
                    
                // Menu 5
                case 5:
                    System.out.println("Selection Sort - Descending");
                    break;
                
                // Menu 6
                case 6:
                    exit = true;
                    System.out.println("Keluar dari program");
                    break;
                // Menu 6 Selesai
                
                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println();
                    break;
            }
        }
    }
    
    // fungsi untuk menampilkan data
    public static void printData(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}


