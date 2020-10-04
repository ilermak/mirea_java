package ex_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.print("Размер поля: ");
        int AreaSize = In.nextInt();
        int Area[][] = new int[AreaSize][AreaSize];
        int Max = 100, Min = -100;

        for(int i = 0; i < AreaSize; i++)
            for (int y = 0; y < AreaSize; y++)
                Area [i][y] = (int)((Math.random() * ((Max - Min) + 1)) + Min);

        for(int x = 0; x < AreaSize; x++){
            for (int y = 0; y < AreaSize; y++) System.out.print(Area[x][y] + "\t");
            System.out.println();
        }

        for(int x = 0; x < AreaSize; x++)
            for(int y = 0; y < AreaSize; y++){
                if(x > 0 && y > 0) Area[x][y] += Math.max(Area[x-1][y], Area[x][y-1]);
                else {
                    if(x > 0) Area[x][y] += Area[x - 1][y];
                    else if(y > 0) Area[x][y] += Area[x][y - 1];
                }
            }

        System.out.print("Сумма: ");
        System.out.print(Area[AreaSize - 1][AreaSize - 1]);
    }
}
