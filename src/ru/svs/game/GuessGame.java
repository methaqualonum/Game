package ru.svs.game;

/**
 * Класс, содержащий игру.
 *
 * @author Щеголева В., группа 15ИТ18
 */

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я думаю, что это число между 0 и 9...");
        while (true) {
            System.out.println("Предполагаемое число " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number_random;
            System.out.println("Первый игрок предполагает: " + guessp1);
            guessp2 = p2.number_random;
            System.out.println("Второй игрок предполагет: " + guessp2);
            guessp3 = p3.number_random;
            System.out.println("Третий игрок предполагает: " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель! ");
                System.out.println("Первый игрок прав? " + p1isRight);
                System.out.println("Второй игрок прав?" + p2isRight);
                System.out.println("Третий игрок прав? " + p3isRight);
                System.out.println("Игра закончена!");
                break;

            } else {
                System.out.println("Игрокам придется попробовать еще раз. ");
            }
        }
    }
}