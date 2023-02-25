public class Classroom {
    private int romno;
    private String roomType;
    private float roomArea;
    private boolean acmachi;

    public Classroom(int romno, String roomType, float roomArea, boolean acmachi) {
        this.romno = romno;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acmachi = acmachi;
    }

    public Classroom() {
        // default constructor
    }

    public void setRoomNo(int romno) {
        this.romno = romno;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomArea(float roomArea) {
        this.roomArea = roomArea;
    }

    public void setACMachine(boolean acmachi) {
        this.acmachi = acmachi;
    }

    public void displayHello() {
        System.out.println("Hello, welcome to room number " + romno);
    }

    public void displayData() {
        System.out.println("Room Number: " + romno);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea);
        System.out.println("AC Machine Installed: " + (acmachi ? "Yes" : "No"));
    }
}
