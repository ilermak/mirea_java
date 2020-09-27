package ex_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Data_In = new Scanner(System.in);

        System.out.print("Please, enter the field size: ");
        int FieldSize = Data_In.nextInt();
        int Field[][] = new int[FieldSize][FieldSize];
        int Max = 100, Min = -100;

        for(int x = 0; x < FieldSize; x++)
            for (int y = 0; y < FieldSize; y++)
                Field [x][y] = (int)((Math.random() * ((Max - Min) + 1)) + Min);

        System.out.println("\nOriginal array:");
        for(int x = 0; x < FieldSize; x++){
            for (int y = 0; y < FieldSize; y++) System.out.print(Field[x][y] + "\t");
            System.out.println();
        }

        for(int x = 0; x < FieldSize; x++)
            for(int y = 0; y < FieldSize; y++){
                if(x > 0 && y > 0) Field[x][y] += Math.max(Field[x-1][y], Field[x][y-1]);
                else {
                    if(x > 0) Field[x][y] += Field[x - 1][y];
                    else if(y > 0) Field[x][y] += Field[x][y - 1];
                }
            }

        System.out.println("\nAuxiliary array:");
        for(int x = 0; x < FieldSize; x++){
            for (int y = 0; y < FieldSize; y++) System.out.print(Field[x][y] + "\t");
            System.out.println();
        }

        System.out.print("\nOur sum: ");
        System.out.print(Field[FieldSize - 1][FieldSize - 1]);
    }
}
