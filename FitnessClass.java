public class FitnessClass {
    private int classId;
    private String className;
    private int maxCapacity;
    private int currentEnrollment;
    
    public FitnessClass() {
        this.currentEnrollment = 0;
    }
    
    public FitnessClass(int classId, String className, int maxCapacity) {
        this.classId = classId;
        this.className = className;
        this.maxCapacity = maxCapacity;
        this.currentEnrollment = 0;
    }
    
    public int getClassId() { return classId; }
    public void setClassId(int classId) { this.classId = classId; }
    
    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }
    
    public int getMaxCapacity() { return maxCapacity; }
    public void setMaxCapacity(int maxCapacity) { this.maxCapacity = maxCapacity; }
    
    public int getCurrentEnrollment() { return currentEnrollment; }
    public void setCurrentEnrollment(int currentEnrollment) { 
        this.currentEnrollment = currentEnrollment; 
    }
    
    public boolean hasAvailableSpaces() {
        return currentEnrollment < maxCapacity;
    }
    
    public boolean incrementEnrollment() {
        if (hasAvailableSpaces()) {
            currentEnrollment++;
            return true;
        }
        return false;
    }
    
    public boolean decrementEnrollment() {
        if (currentEnrollment > 0) {
            currentEnrollment--;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return className + " (" + currentEnrollment + "/" + maxCapacity + ")";
    }
}