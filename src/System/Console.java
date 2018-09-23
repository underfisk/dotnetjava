package System;

import java.util.Scanner;

/**
 * @package org.microsoft.dotnet
 * @author Enigma
 * @description This class have been made as an alias to fix the Java gargabe syntax
 */
public final class Console
{
    /**
     * Private instance of scanner and being unique
     */
    private static Scanner reader = new Scanner(System.in);

    /**
     * Writes a string and ends with a line
     * @param str
     */
    public static <T> void WriteLine(T str)
    {
        System.out.println(str);
    }

    /**
     * Writes a string
     * @param str
     */
    public static <T> void Write(T str)
    {
        System.out.print(str);
    }

    /**
     * Reads a string line
     * @return
     */
    public static String ReadLine()
    {
        return reader.nextLine();
    }

    /**
     * Reads integer input
     * @return
     */
    public static int ReadInt()
    {
        return reader.nextInt();
    }

    /**
     * Reads double input
     * @return
     */
    public static double ReadDouble()
    {
        return reader.nextDouble();
    }

    /**
     * Reads long input
     * @return
     */
    public static long ReadLong()
    {
        return reader.nextLong();
    }

    /**
     * Reads float input
     * @return
     */
    public static float ReadFloat()
    {
        return reader.nextFloat();
    }

    /**
     * Reads bool input
     * @return
     */
    public static boolean ReadBoolean()
    {
        return reader.nextBoolean();
    }

    /**
     * Read byte input
     * @return
     */
    public static byte ReadByte()
    {
        return reader.nextByte();
    }

    /**
     * Read short input
     * @return
     */
    public static short ReadShort()
    {
        return reader.nextShort();
    }

    /**
     * Frees the resources being used, in this case frees
     * scanner instance in case we want to stop using Read methods
     */
    public static void Dispose()
    {
        reader = null;
        WriteLine("System.Console resources have been released.");
    }
}