package chapter01;

// TODO 接口
public class Java06_Interface {
    public static void main(String[] args) {
        // 基本语法：interface 接口名称{规则属性 规则的行为}
        // 接口是抽象的，属性和行为是具体的
        // 规则的属性必须是固定值，不能修改
        // 属性和行为的访问权限是公共的
        // 属性是静态的，行为是抽象的
        // 接口和类是两个层面的东西
        // 接口可以继承其他的接口
        // 类的对象需要遵循接口，在Java中为实现，类需要实现接口，而且可以实现多个接口
        Computer computer = new Computer();

        Light light = new Light();
        computer.usb1 = light;

        Light light2 = new Light();
        computer.usb2 = light2;

        computer.Supply();

    }
}


interface  USB {

}

interface USBSupply extends USB{
    public void Supply();
}

interface USBReceive extends USB{
    public void Receive();
}

class Computer implements USBSupply{
    public USBReceive usb1;
    public USBReceive usb2;

    public void Supply(){
        System.out.println("Computer Supply");
        usb1.Receive();
        usb2.Receive();
    }
}

class Light implements USBReceive{
    public void Receive(){
        System.out.println("Light Receive");
    }
}



