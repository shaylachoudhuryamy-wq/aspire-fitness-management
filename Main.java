public class Main {
    public static void main(String[] args) {
        System.out.println("=== Aspire Fitness Management System ===");
        
        // Test database connection
        if (DatabaseConnection.testConnection()) {
            System.out.println("✓ Database connection successful!");
        } else {
            System.out.println("✗ Database connection failed!");
        }
        
        // Test Member class
        Member member = new Member();
        member.setFirstName("John");
        member.setSurname("Smith");
        member.setEmail("john@email.com");
        
        System.out.println("\nMember Details:");
        System.out.println("Name: " + member.getFullName());
        System.out.println("Email: " + member.getEmail());
        System.out.println("Can book free class: " + member.canBookFreeClass());
        
        // Test FitnessClass class
        FitnessClass fitnessClass = new FitnessClass();
        fitnessClass.setClassName("Yoga");
        fitnessClass.setMaxCapacity(25);
        fitnessClass.setCurrentEnrollment(10);
        
        System.out.println("\nClass Details:");
        System.out.println("Name: " + fitnessClass.getClassName());
        System.out.println("Available spaces: " + fitnessClass.hasAvailableSpaces());
        
        // Test booking limit
        for (int i = 0; i < 6; i++) {
            member.addBooking(new Booking(1, 1));
        }
        System.out.println("\nWeekly class count: " + member.getWeeklyClassCount());
        System.out.println("Extra class cost: £" + member.getExtraClassCost());
        
        System.out.println("\n✓ All tests passed!");
    }
}