package chapter04;

import java.util.ArrayList;
import java.util.HashSet;

public class Java04_Hash {
    public static void main(String[] args) {
        //TODO HashSet 底层是数组+链表，数据无序
        // hash冲突处理
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");

        hashSet.remove("A");
        hashSet.isEmpty();
        for(String s: hashSet){
            System.out.println(s);
        }

        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        hashSet.addAll(list);
        for(String s: hashSet){
            System.out.println(s);
        }

       Object obj =  hashSet.toArray();
       boolean exist = hashSet.contains("A");
       Object cl =   hashSet.clone();
       hashSet.clear();

       User user1 = new User();
       User user2 = new User();
       User user3 = new User();

       user1.ID = 1001;
       user1.name = "A";
       user2.ID = 1001;
       user2.name = "A";
       user3.ID = 1001;
       user3.name = "A";

       HashSet<User> hashSet1 = new HashSet<User>();
       hashSet1.add(user1);
       hashSet1.add(user2);
       hashSet1.add(user3);
       System.out.println(hashSet1);
    }
}
// hash算法重写

class User{
    public String name;
    public int ID;

    @Override
    public int hashCode() {
        return ID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User u = (User)obj;
            if (u.name.equals(this.name)) {
                return true;
            }
            return  false;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "User[" + ID + ", " + name + ']';
    }
}
