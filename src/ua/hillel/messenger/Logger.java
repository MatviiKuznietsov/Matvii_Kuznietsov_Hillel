package ua.hillel.messenger;

public class Logger {
    static void info(String status) {
        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + "Status - " + status);
    }

    static void debug(String status) {
        System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT + "Status - " + status);
    }

    static void warn(String status) {
        System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + "Status - " + status);
    }

    static void error(String status) {
        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Status - " + status);
    }
}
