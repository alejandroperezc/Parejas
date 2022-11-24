import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int tamano = 6;

        String[] emojis = {"🦦 ","🤮 ","💩 ","🐬 ","🖕 ","🎅 ","👻 ","❤ ","💀 ","🍌 ","🦋 ","🎱 ","🎲 ","🎭 ","🏆 ","🔥 ","🌍 ","🍻 "};

        int cuantos = (tamano * tamano) / 2;

        String[][] tablero = new String[tamano][tamano];

        boolean[][] acertada = new boolean[tamano][tamano];


        for (int i = 0; i < cuantos; i++) {
            for (int j = 0; j < 2; j++) {
                for (;;) {
                    int f1 = random.nextInt(tamano);
                    int c1 = random.nextInt(tamano);

                    if (tablero[f1][c1] == null) {
                        tablero[f1][c1] = emojis[i];
                        break;
                    }
                }
            }
        }

//        for (int i = 0; i < tamano; i++) {
//            for (int j = 0; j < tamano; j++) {
//                System.out.print("\uD83C\uDF81 ");
//            }
//            System.out.println();
//        }


        for (;;) {

            int f1 = scanner.nextInt();
            int c1 = scanner.nextInt();
            int f2 = scanner.nextInt();
            int c2 = scanner.nextInt();

            if (tablero[f1][c1].equals(tablero[f2][c2])) {
                acertada[f1][c1] = true;
                acertada[f2][c2] = true;
            }

            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    if (acertada[i][j]) {
                        System.out.print(tablero[i][j]);
                    } else if (i == f1 && j == c1) {
                        System.out.print(tablero[i][j]);
                    } else if (i == f2 && j == c2) {
                        System.out.print(tablero[i][j]);
                    } else {
                        System.out.print("\uD83C\uDF81 ");
                    }
                }
                System.out.println();
            }
        }








        /*
        🤮🦦🖕🎅
        🦦🐬💩👻
        🖕🎅👻❤
        ❤🤮💩🐬


        🦦🤮💩🐬🖕🎅👻❤💀🍌🦋🎱🎲🎭🏆🔥🌍🍻
         */
    }
}
