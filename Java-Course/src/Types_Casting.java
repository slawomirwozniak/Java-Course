public class Types_Casting {
    public static void main(String[] args) {
        //7
        /*Rzutowanie typów odbywa się po przez przypisanie wartości jednej wartości typu prymitywnego do drugiej:*/
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
        /*
        Rzutowanie zwiększające wartość (automatyczne) - konwertuje mniejszą wartość typu na większą wartość typu:
        byte -> short -> char -> int -> long -> float -> double

        Rzutowanie pomniejszające wartość (manualne) - konwertuje większą wartość typu na mniejszą wartość typu:
        double -> float -> long -> int -> char -> short -> byte
        */
    }
}

