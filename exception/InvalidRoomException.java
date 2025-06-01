package exception;

public class InvalidRoomException extends Exception {
    @Override
    public String toString() {
        return "Nomor kamar tidak valid!";
    }
}
