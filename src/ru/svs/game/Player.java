package ru.svs.game;

/**
 * Класс для определния ответа игрока с помощью рандома.
 *
 * @author Щеголева В., группа 15ИТ18
 */

public class Player {
    int number_random = 0;

    public void guess() {
        number_random = (int) (Math.random() * 10);
    }



}