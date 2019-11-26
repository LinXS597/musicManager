package cn.edu.zucc.musicmanager.result;

public class Chartres {
    private String sex;
    private int count;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Chartres{" +
                "sex='" + sex + '\'' +
                ", count=" + count +
                '}';
    }
}
