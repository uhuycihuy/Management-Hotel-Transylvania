package exception;

public class RoomNotAvailableException extends Exception {
    @Override
    public String toString() {
        return "Kamar telah di book!";
    }
}