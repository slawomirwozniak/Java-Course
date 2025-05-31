public class Primitive_Data_Types {
    public static void main(String[] args) {
        //5
        //Typy prymitywne:
        byte myByte = -128;    //Przechowuje liczby całkowite od -128 do 127
        short myShort = -32768; //Przechowuje liczby od -32,768 do 32,767
        int myInt = -2147483648; //Przechowuje liczby od -2,147,483,648 do 2,147,483,647
        long myLong = 9223372036854775807L; //Przechowuje wartości liczbowe od -9,223,372,036,854,775,808 do 9,223,372,036,854,775,807. Wymaga wartości L na końcu
        float myFloat = 1.5000000f; //Przechowuje wartości ułamkowe liczb dziesiętnych od 6 do 7 wartości cyfr po przecinku. Wymaga wartości f na końcu.
        double myDouble = 0.12421421321d; //Przechowuje liczby ułamkowe. Wystarczające do przechowywania od 15 do 16 cyfr dziesiętnych
        boolean myBoolean = false; //Przechowuje wartości true lub false
        char myChar = 'A'; //Przechowuje pojedynczy znak/literę lub wartości ASCII
        /*Typy danych float i double mogą przechowywać liczby ułamkowe. Należy pamiętać, że należy zakończyć wartość literą „f” dla floatów i „d” dla double

        Główne różnice między prymitywnymi i nieprymitywnymi typami danych to:
        Typy prymitywne w Javie są wstępnie zdefiniowane i wbudowane w język, podczas gdy typy nieprymitywne są tworzone przez programistę (z wyjątkiem String).
        Typy nieprymitywne mogą być używane do wywoływania metod w celu wykonania pewnych operacji, podczas gdy typy prymitywne nie mogą.
        Typy prymitywne zaczynają się od małej litery (jak int), podczas gdy typy nieprymitywne zwykle zaczynają się od dużej litery (jak String).
        Typy prymitywne zawsze przechowują wartość, podczas gdy typy nieprymitywne mogą być nullem.*/
        System.out.println("Byte: " + myByte + "Short" + myShort + "Int: " + myInt + "Boolean: " + myBoolean + " Char: " + myChar + " Long: " + myLong + " Float " + myFloat + " Double: " + myDouble);
    }
}