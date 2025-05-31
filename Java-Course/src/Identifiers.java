public class Identifiers {
    public static void main (String[] args)
    {
        //4
        //Identyfikatory to inaczej unikalne nazwy zmiennych w Java:
        //Sugeruje się używanie opisowych nazw zmiennych tak aby utworzyć zrozumiały i utrzymalny kod:
        int minutesPerHour = 60;
        System.out.println(minutesPerHour);
        /*Zasady nazywania zmiennych w Java:
        Nazwy zmiennych mogą zawierać litery, imiona, cyfry, podkreślniki albo znaki $
        Nazwa zmiennych musi się rozpoczynać od litery
        Nazwa musi się zaczynać od małej litery i nie może zawierać spacji*/
        String przykladowaZmienna = "jakaś zmienna";
        System.out.println(przykladowaZmienna);
        //Nazwa może się także rozpoczynać od $ lub _
        String $nazwa_zmiennej = "jakiś string";
        System.out.println($nazwa_zmiennej);
        //Nazwy zmiennych są wrażliwe na wielkość znaków: mojaZmienna i moja zmienna to są dwie różne zmienne
        //Nazwy zmiennych nie mogą składać się ze słów kluczowych takich np. int boolean

    }
}
