public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;

        //FIX_ME: передача ссылки
        //this.marks = marks;
        this.marks = marks.clone();
    }

    public Student(Student student) {
        this.name = student.name;

        //FIX_ME: копирование ссылки
        //this.marks = student.marks;
        this.marks = student.marks.clone();
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        //FIX_ME: утечка массива
        //return marks;
        return marks.clone();
    }

    public void setMarks(int[] marks) {
        //FIX_ME: передача ссылки
        //this.marks = marks;
        this.marks = marks.clone();
    }

    public void changeMark(int index, int newMark) {
        if (index < 1 || index > marks.length) {
            throw new IllegalArgumentException("Неверный индекс");
        }
        marks[index - 1] = newMark;
    }

    @Override
    public String toString() {

        //FIX_ME: сравнение строк через ==
        //if (array == "")

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < marks.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(marks[i]);
        }

        return name + ": [" + sb + "]";
    }
}