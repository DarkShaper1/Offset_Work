import java.util.ArrayList;
import java.util.Objects;

public class List_class {
    int number;
    ArrayList<Schoolboy> schoolboys = new ArrayList<Schoolboy>();

    public List_class() {
        this.number = 0;
        this.schoolboys = new ArrayList<Schoolboy>();
    }

    public List_class(List_class c) {
        this.number = c.number;
        this.schoolboys = c.schoolboys;
    }

    public List_class(int number, ArrayList<Schoolboy> list) {
        this.number = number;
        this.schoolboys = list;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSchoolboys(ArrayList<Schoolboy> schoolboys) {
        this.schoolboys = schoolboys;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Schoolboy> getSchoolboys() {
        return schoolboys;
    }

    public double getAverageMark() {
        double marks = 0;
        int count = 0;
        for (Schoolboy schoolboy: schoolboys) {
            marks += schoolboy.getMark();
            count++;
        }
        return marks/count;
    }

    public ArrayList<Schoolboy> getSortingList() {
        this.schoolboys.sort(new SchoolboyByMarkComparator());
        return schoolboys;
    }

    public ArrayList<Schoolboy> getSchoolboysByTitle(String title_of_item) {
        ArrayList<Schoolboy> list1 = new ArrayList<Schoolboy>();
        for (Schoolboy schoolboy: schoolboys) {
            if (Objects.equals(schoolboy.getTitle_of_item(), title_of_item)) {
                list1.add(schoolboy);
            }
        }
        return list1;
    }
}
