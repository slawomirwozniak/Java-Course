public class Variables {
    public static void main(String[] args) {
        //3
        //Declarowanie różnych typów zmiennych w Java:
        int myNum = 5;
        float myFloatNum = 1.5f;
        char myLetter = 'A';
        boolean myBool = true;
        String myText = "Witam";
        //Wypisanie wartości poszczegolnych zmiennych przy pomocy kontateminacji i metody println():
        System.out.println("Liczba całkowita: " + myNum + "Liczba zmiennoprzecinkowa: " + myFloatNum + " Litera: " + myLetter + " Prawda / Fałsz: " + myBool + " Wyraz: " + myText);
        /*Deklaracja wielu zmiennych tego samego typu:
        int x = 5, y = 6, z = 50;*/
        /*Przypisanie jednej wartości dla różnych zmiennych tego samego typu:
        int x, y, z;
        x = y = z = 50;*/

        // Obliczenie pola trójkąta na przykładzie w Java:
        int length = 4;
        int width = 6;
        int area;

        // Obliczenie pola trójkąta
        area = length * width;

        // Wyspianie wartości poszczególnych zmiennych
        System.out.println("Długość: " + length);
        System.out.println("Szerokość: " + width);
        System.out.println("Pole trójkąta stanowi: " + area);
    }
}


