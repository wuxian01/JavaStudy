package chapter03;

// TODO 异常
// 1. 可以通过代码恢复正常逻辑执行的异常，运行期异常： RuntimeException
// 2. 不可以通过代码回复正常的异常，编译器异常：Exception
public class Java01_Exception {
    public static void main(String[] args) {
        // TODO 语法
        // TODO 常见异常
        // 1. 计算异常 ArithmeticException
        // 2. 运行期 空指针异常 NullPointerException
        // 3. 索引越界 ArrayIndexOutOfBoundsException
        // 4. 字符串索引越界 StringIndexOutOfBoundsException
        // 5. 格式化异常 NumberFormatException
        // 6. 类型转换错误 ClassCastException

//        User  u = new User();
//        try {
//            u.test(10,0);
//        }catch (Exception e){
//           e.printStackTrace();
//        }




        /*
        try {

        } catch(异常对象) {
            解决方法
        } catch {

        } finally {

        }
         */
//        int i = 1, j = 0;
//        try {
//            i = 10/j;
//        } catch (Exception e){
////            i = 10;
////            j = 10;
//            e.printStackTrace();
//        }finally {
//            System.out.println("error");
//        }
//
//        System.out.println(i);
            try{
                login("admin", "123456");
            }catch(AccountException | PasswordException e){
                System.out.println(e.getMessage());
            } catch(LoginException e){
                System.out.println(e.getMessage());
            }

    }
    public static void login(String username, String password) {
        if(!"admin".equals(username)){
            throw new AccountException("account error");
        }
        if(!password.equals("123456")){
            throw new PasswordException("password error");
        }
    }
}

// 抛出异常
class User {
    public void test(int i, int j) throws Exception {
       try {
           System.out.println(i/j);
       } catch (ArithmeticException e) {
           throw new Exception();
       }
    }
}

class PasswordException extends LoginException {
    public PasswordException(String msg) {
        super(msg);
    }
}

class AccountException extends LoginException {
    public AccountException(String msg) {
        super(msg);
    }
}

class  LoginException extends RuntimeException{
    public LoginException(String message) {
        super(message);
    }
}