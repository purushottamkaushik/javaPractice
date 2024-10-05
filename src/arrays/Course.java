package arrays;

public class Course implements Comparable<Course>{
    private String name;
    private int id;
    private int price;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Course(int id, String name, int price) {
        this.id = id;

        this.name = name;
        this.price = price;
    }





    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }



    @Override
    public int compareTo(Course o) {
        return this.id - o.id;
    }
}
