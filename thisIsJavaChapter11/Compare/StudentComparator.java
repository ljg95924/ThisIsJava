package thisIsJavaChapter11.compare;

import java.util.Comparator;

public class StudentComparator implements Comparator<CompareExample.Student> {


    @Override
    public int compare(CompareExample.Student o1, CompareExample.Student o2) {
        return Integer.compare(o1.sno, o2.sno);
    }
}
