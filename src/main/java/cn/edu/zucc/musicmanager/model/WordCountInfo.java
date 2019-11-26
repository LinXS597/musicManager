package cn.edu.zucc.musicmanager.model;

public class WordCountInfo {
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "WordCountInfo{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
