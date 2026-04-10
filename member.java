import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private String email;
    private String address;
    private String medicalConditions;
    private int weeklyClassCount;
    private List<Booking> bookings;
    
    public Member() {
        this.bookings = new ArrayList<>();
        this.weeklyClassCount = 0;
    }
    
    public Member(int id, String firstName, String surname, String email) {
        super(id, firstName, surname);
        this.email = email;
        this.bookings = new ArrayList<>();
        this.weeklyClassCount = 0;
    }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getMedicalConditions() { return medicalConditions; }
    public void setMedicalConditions(String medicalConditions) { 
        this.medicalConditions = medicalConditions; 
    }
    
    public int getWeeklyClassCount() { return weeklyClassCount; }
    public void setWeeklyClassCount(int weeklyClassCount) { 
        this.weeklyClassCount = weeklyClassCount; 
    }
    
    public List<Booking> getBookings() { return bookings; }
    
    public boolean canBookFreeClass() {
        return weeklyClassCount < 5;
    }
    
    public int getExtraClassCost() {
        if (weeklyClassCount <= 5) {
            return 0;
        }
        return (weeklyClassCount - 5) * 5;
    }
    
    public void addBooking(Booking booking) {
        this.bookings.add(booking);
        this.weeklyClassCount++;
    }
    
    public void resetWeeklyClassCount() {
        this.weeklyClassCount = 0;
    }
    
    @Override
    public String getRoleDescription() {
        return "Member";
    }
}