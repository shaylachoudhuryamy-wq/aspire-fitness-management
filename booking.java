import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int memberId;
    private int classId;
    private LocalDate bookingDate;
    private String bookingWeek;
    private boolean isFree;
    
    public Booking() {}
    
    public Booking(int memberId, int classId) {
        this.memberId = memberId;
        this.classId = classId;
        this.bookingDate = LocalDate.now();
        this.isFree = true;
    }
    
    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }
    
    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) { this.memberId = memberId; }
    
    public int getClassId() { return classId; }
    public void setClassId(int classId) { this.classId = classId; }
    
    public LocalDate getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }
    
    public String getBookingWeek() { return bookingWeek; }
    public void setBookingWeek(String bookingWeek) { this.bookingWeek = bookingWeek; }
    
    public boolean getIsFree() { return isFree; }
    public void setIsFree(boolean isFree) { this.isFree = isFree; }
}