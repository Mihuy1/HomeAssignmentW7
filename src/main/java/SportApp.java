public class SportApp {

    private String name;
    private int duration;
    private String day;

    public SportApp(String name, int duration, String day) {
        this.name = name;
        this.duration = duration;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDay(String day) {
        this.day = day;
    }


    @Override
    public String toString() {
        return "Activity: " + name + ", Duration: " + duration + ", Day: " + day;
    }
}

