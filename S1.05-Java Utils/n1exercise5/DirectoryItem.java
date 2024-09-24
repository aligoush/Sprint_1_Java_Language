package n1exercise5;

import java.io.Serializable;

public class DirectoryItem implements Serializable {
    static final long serialVersionUID = 1L;
    String name;
    boolean isDirectory;
    long lastModified;
    public DirectoryItem(String name, boolean isDirectory, long lastModified) {
        this.name = name;
        this.isDirectory = isDirectory;
        this.lastModified = lastModified;
    }
    @Override
    public String toString() {
        return (isDirectory ? "D" : "F") + " - " + name + " - " + lastModified;
    }
}
