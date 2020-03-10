package io.zipcoder.interfaces;

public enum Educator implements Teacher {


    FROILAN((long)1003, "Froilan"),
    KRIS((long) 1001, "Kris"),
    DOLIO((long) 1002, "Dolio"),
    NOBLES((long) 1004, "Nobles");


    private final Instructor instructor;
    double timeWorked;

    Educator(Long id,String name) {
        this.instructor = new Instructor(id);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);
        this.timeWorked = 0;
    }
    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }
    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return this.timeWorked;
    }
}

