package chapter01;

// TODO bean规范
// 面向对象
// 1. 编写逻辑
// 2. 建立数据模型(Bean类)
// bean 规范
// 1. 类要求包含无参，公共的构造方法
// 2. 属性必须私有化，提供公共的set,get 方法供外部调用
public class Java09_DataMode {
    public static void main(String[] args) {
        User user = new User();
        user.setAccount("admin");
        user.setPassword("admin");
        System.out.println(login(user));

    }
    public static boolean login(User user) {
        if (user.getAccount().equals("admin") && user.getPassword().equals("admin")) {
            return true;
        }
        return false;
    }
}

class User {
    private String account;
    private String password;
//    public User(String account, String password) {
//        this.account = account;
//        this.password = password;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}



