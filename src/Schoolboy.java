import java.util.Comparator;

public class Schoolboy {
    String name;
    String surname;
    String title_of_item;
    int number_of_class;
    int mark;

    public Schoolboy() {
        this.name = "";
        this.title_of_item = "";
        this.mark = 0;
        this.surname = "";
        this.number_of_class = 0;
    }

    public Schoolboy(Schoolboy c) {
        this.name = c.name;
        this.title_of_item = c.title_of_item;
        this.mark = c.mark;
        this.surname = c.surname;
        this.number_of_class = c.number_of_class;
    }

    public Schoolboy(String name, String surname, int number_of_class, String title_of_item, int mark) throws Exception{
        if (name.isEmpty()) {
            throw new Exception("Строка имени не должна быть пустой");
        }
        this.name = name;
        this.title_of_item = title_of_item;
        this.mark = mark;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getNumber_of_class() {
        return number_of_class;
    }

    public String getTitle_of_item() {
        return this.title_of_item;
    }

    public int getMark() {
        return this.mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber_of_class(int number_of_class) {
        this.number_of_class = number_of_class;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setTitle_of_item(String title_of_item) {
        this.title_of_item = title_of_item;
    }
}

class SchoolboyByMarkComparator implements Comparator<Schoolboy> {
    public int compare(Schoolboy o1, Schoolboy o2) {
        return Double.compare(o1.getMark(), o2.getMark());
    }
}
