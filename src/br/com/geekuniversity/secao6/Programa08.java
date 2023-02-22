package br.com.geekuniversity.secao6;

// Tipo de dados
// Numéricos (Inteiros e Reais)
public class Programa08 {
    public static void main(String[] args) {

        // Tipos primários -> são mais rápidos na execuçao
        long num0 = 99; // Inteiro 9999999999999999999999999
        int num1 = 4; // Inteiro 99999999999999 -> ocupa mais espaço de memória
        short num2 = 4; // Inteiro (curto/menor) 999999 - > ocupa menos espaço de memória
        byte num3 = 4; // Inteiro
        char num8 = 34;

        // Tipos nao primários -> usados para fazer uma conversão (parsear)
        Long num7 = 99999999L;
        Integer num4 = 98;
        Short num5 = 7;
        Byte num6 = 9;
        Character num9 = 35;

        System.out.println("\nlong -> num0: " + num0 + "\nint -> Num1: " + num1 + "\nshort -> num2: " + num2 + "\nbyte -> num3: " + num3 + "\nInteger -> num3: " + num4 + "\nShort -> num4: " + num5 + "\nByte -> num6: " + num6 + "\nLong -> num7: " + num7 + "\nchar -> num8: " + num8 + "\nCharacter -> num9: " + num9);

        System.out.println("int/Integer: " + Integer.SIZE + " bits");
        System.out.println("int/Integer: " + Double.SIZE + " bits");
        System.out.println("int/Integer: " + Float.SIZE + " bits");
        System.out.println("short/Short: " + Short.SIZE + " bits");
        System.out.println("byte/Byte: " + Byte.SIZE + " bits");
        System.out.println("long/Long: " + Long.SIZE + " bits");
        System.out.println("char/Character: " + Character.SIZE + " bits");

        System.out.println("Valor minímo int/Integer: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo int/Integer: " + Integer.MAX_VALUE);

        System.out.println("Valor minímo double/Double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo double/Double: " + Double.MAX_VALUE);

        System.out.println("Valor minímo float/Float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo float/Float: " + Float.MAX_VALUE);

        System.out.println("Valor minímo short/Short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo short/Short: " + Short.MAX_VALUE);

        System.out.println("Valor minímo byte/Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte/Byte: " + Byte.MAX_VALUE);

        System.out.println("Valor minímo long/Long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo Long/Long: " + Long.MAX_VALUE);

        System.out.println("Valor minímo char/Character: " + Character.MIN_VALUE); // 0
        System.out.println("Valor máximo char/Character: " + Character.MAX_VALUE); // 65535
    }
}
