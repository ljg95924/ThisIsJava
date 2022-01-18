package ThisIsJavaChapter11.hashCode;

import java.util.Objects;

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Key) {
            Key comparyKey = (Key) o;
            if (this.number == comparyKey.number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
