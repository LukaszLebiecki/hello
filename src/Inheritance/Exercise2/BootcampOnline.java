package Inheritance.Exercise2;

public class BootcampOnline extends OnlineCourse {
    private String teacher;
    private int consultationHours;

    public BootcampOnline(String id, double price, String title, String description, String teacher,
                          int videoLength, int timeToFinish, int consultationHours) {
        super(id, price, title, description, videoLength, timeToFinish);
        this.teacher = teacher;
        this.consultationHours = consultationHours;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(int consultationHours) {
        this.consultationHours = consultationHours;
    }
}
