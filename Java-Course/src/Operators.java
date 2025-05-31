public class Operators {
    public static void main (String[] args){
        //8
        //Operators są wykorzystywane do wykonywania operacji pomiędzy zmiennymi i wartościami.
        //Operatory arytmetyczne
        //TODO: DO UZUPELNIENIA https://www.w3schools.com/java/java_operators.asp
        //Operatory przypisania - służą do przypisywania wartości do zmiennych
        //TODO: DO UZUPELNIENIA https://www.w3schools.com/java/java_operators.asp
        //Operatory porównania - służą do porównania dwóch zmiennych / wartości
        int c = 5;
        int d = 3;
        //== - Równe c == d
        System.out.println(c == d); // zwraca false, ponieważ 5 nie jest równe 3
        //!= - Nierówne c != d
        System.out.println(c != d); // zwraca true, ponieważ 5 nie jest równe 3
        //> - Większe niż c > d
        System.out.println(c > d); // zwraca true, ponieważ 5 jest większe niż 3
        //< - Mniejsze niż c < d
        System.out.println(c < d); // zwraca false, ponieważ 5 nie jest mniejsze niż 3
        //>= - Większe lub równe c >= d
        System.out.println(c >= d); // zwraca wartość true, ponieważ 5 jest większe lub równe 3
        //<= - Mniejsze lub równe c <= d
        System.out.println(c <= d); // zwraca wartość false, ponieważ 5 nie jest mniejsze ani równe 3
        //Operatory logiczne - polegają na założeniu logiki powiązań zmiennymi lub wartościami
        //&& Logiczne and Zwraca wartość true, jeśli oba stwierdzenia są prawdziwe
        int x = 5;
        System.out.println(x > 3 && x < 10); // zwraca wartość true, ponieważ 5 jest większe od 3 ORAZ 5 jest mniejsze od 10
        //|| Logiczne or Zwraca wartość true, jeśli jedno ze stwierdzeń jest prawdziwe x < 5 || x < 4
        System.out.println(x > 3 || x < 4); // zwraca wartość true, ponieważ jeden z warunków jest prawdziwy (5 jest większe od 3, ale 5 nie jest mniejsze od 4)
        //! Logiczne not Odwróć wynik, zwraca false, jeśli wynik jest prawdziwy
        System.out.println(!(x > 3 && x < 10)); // zwraca false, ponieważ ! (not) jest używane do odwrócenia wyniku
        //Operatory bitowe - służą do przeprowadzania operacji na wartościach bitowych:
        int a = 5;
        int b = 7;
        //& - AND - Operator bitowy AND & zwraca 1 wtedy i tylko wtedy, gdy oba operandy są równe 1. W przeciwnym razie zwraca 0.
        System.out.println("a&b = " + (a & b));
        //| - OR - Operator bitowy OR | zwraca 1, jeśli przynajmniej jeden z operandów jest równy 1. W przeciwnym razie zwraca 0.
        System.out.println("a|b = " + (a | b));
        //^ - XOR - Operator bitowy XOR ^ zwraca 1 wtedy i tylko wtedy, gdy jeden z operandów jest równy 1. Jednak jeśli oba operandy są równe 0 lub jeśli oba są równe 1, wynik wynosi 0.
        System.out.println("a^b = " + (a ^ b));
        //~ - NOT - Operator dopełnienia bitowego jest operatorem jednoargumentowym (działa tylko z jednym operandem). Jest oznaczony jako ~.
        System.out.println("~a = " + ~a);
        //<< - Przesunięcie w lewo - Operator przesunięcia w lewo przesuwa wszystkie bity w lewo o określoną liczbę określonych bitów. Jest oznaczony jako <<.
        //>> - Przesunięcie w prawo ze znakiem - Operator przesunięcia w prawo ze znakiem przesuwa wszystkie bity w prawo o określoną liczbę określonych bitów. Jest oznaczony jako >>.
    }
}
