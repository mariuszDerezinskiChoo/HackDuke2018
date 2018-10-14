public class Task {
    private String name;
    private float upper;
    private float lower;
    private int priority;
    private String date;
    private float order;

    public Task(String name, float Upper, float Lower, float ORDER, int PRIORITY, String DATE) {
        name = name;
        upper = Upper;
        lower = Lower;
        order = ORDER;
        priority = PRIORITY;
        date = DATE;
    }

    public String getName() {
        return name;
    }

    public float getUpper() {
        return upper;
    }

    public float getLower() {
        return lower;
    }

    public float getOrder() {
        return order;
    }

    public int getPriority() {
        return priority;
    }

    public String getDate() {
        return date;
    }

}


