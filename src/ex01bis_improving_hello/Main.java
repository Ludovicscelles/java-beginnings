package ex01bis_improving_hello;

public class Main {
 
    public static void main (String[] args) {
        String[] messages = {
            "Hello, World!",
            "Bonjour, le monde!",
            "Hallo, Welt!",
            "Ciao, mondo!",
            "Hola, Mundo!",
            "Olá, Mundo!",
            "Привет, мир!",
            "こんにちは、世界！",
            "안녕하세요, 세계!",
            "مرحبا بالعالم!",
            "שלום, עולם!"
        };

        for (String message : messages) {
            System.out.println(message);
        }
    }
}