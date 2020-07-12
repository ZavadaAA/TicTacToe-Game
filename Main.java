package ru.geekbrains.Lesson_4;

public class Main {
    static char [][] map;
    static int SIZE = 3;
    static int DOTS_TO_WIN = 3;

    static char DOT_EMPTY = '.';
    static char DOT_X = 'X';
    static char DOT_0 = '0';

    public static void main(String[] args)
    {
        initMap();
        printMap();

    }
    static void initMap ()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                map[i][j] = '-';
            }
        }
    }

}
