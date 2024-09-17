package com.gyy.api_object;

// Cloneable是一个标记接口
// 规则,没有任何东西,仅作为标记,表明实现了某个规则
public class User implements Cloneable {
    private int id; // 编号
    private String Username; // 用户名
    private String password; // 密码
    private double[] scores; // 分数

    public User() {
    }

    public User(int id, String username, String password, double[] scores) {
        this.id = id;
        Username = username;
        this.password = password;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
