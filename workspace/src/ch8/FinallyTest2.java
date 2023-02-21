package src.ch8;

public class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        } // try-catch
    } // main

    static void startInstall() {

    }
    static void copyFiles() {}
    static void deleteTempFiles() {}
}
