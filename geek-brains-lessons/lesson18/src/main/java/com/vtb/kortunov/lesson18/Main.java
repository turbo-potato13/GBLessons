package com.vtb.kortunov.lesson18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrepareDataApp prepareDataApp = new PrepareDataApp();
        DbManagement dbManagement = new DbManagement(null, prepareDataApp);
        Commands commands = new Commands(dbManagement);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        commands.executor(str);

    }
}
