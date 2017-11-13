package ru.svs.game;

/**
 * Класс для запуска игры.
 *
 * @author Щеголева В., группа 15ИТ18
 */

public class GameLauncher {
    public static void main (String[] args){
        GuessGame game = new GuessGame();
        game.startGame();
    }
}
