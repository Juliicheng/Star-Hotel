package models;

// import java.util.Arrays;

import java.util.Date;

public class Room {

    private RoomType roomType;
    private int roomID;
    private float price;
    private int[][] availability;

    /**
     * @param roomID
     */
    public void Room(int roomID) {
        // TODO - implement Room.Room
        throw new UnsupportedOperationException();
    }

    /**
     * @param roomID
     * @param startDate
     * @param endDate
     */
    public Room enquire(String roomID, Date startDate, Date endDate) {
        // TODO - implement Room.enquire
        throw new UnsupportedOperationException();
    }

    /**
     * @param roomType
     * @param startDate
     * @param endDate
     */
    public int[][] enquire(int roomType, Date startDate, Date endDate) {
        // TODO - implement Room.enquire
        throw new UnsupportedOperationException();
    }

    public int[][] getAvailability() {
        return this.availability;
    }

    /**
     * @param availability
     */
    public void setAvailability(int[][] availability) {
        this.availability = availability;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getRoomID() {
        return this.roomID;
    }

    public float getPrice() {
        return this.price;
    }

    public enum RoomType {
        ;

        int standardRoom;
        int executiveSuite;
        int penhouseSuite;
        int familySuite;

    }

}