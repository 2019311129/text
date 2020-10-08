# text
Java实验
#实验内容
基本要求：完成教材p110第四题关于PC，内存等模拟的程序。附加要求：类中定义过多于两个构造方法；每个类定义过多于2个属性，并且属性的类型应该最小；；根据课堂中关于访问权限的内容，尝试定义属性的修饰符符号，类中定义方法操作属性，避免直接通过“类对象。属性”的形式访问属性值；并且定义的方法内部应该有符合常理的逻辑判断；尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
#实验过程
创建测试主类cpu硬盘pc类并赋值
#实验方法
创建三个类HD，CPU,PC，在测试中创建cpu磁盘pc对象并设置数值cpu类返回速度值，getSpeed赋值给速度；硬盘类返回量值； pc类getCPU赋值给cpu，getHardDisk（硬盘h）赋值给HD。最后text测试代码
#核心代码
package text2;

class HardDisk{
	int type;
	int amount;
	int getAmount(){
		return amount;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}
	int getType(){
		return type;
	}
	public void setSpeed(String type[]){
        }
}
class CPU {
	int speed;
	int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
}
class PC{
	CPU cpu;
	HardDisk HD;
	void setHardDisk(HardDisk HD){
		this.HD = HD;
	}
	void show(){
		System.out.println("电脑CPU速度：" + cpu.getSpeed());
		System.out.println("电脑硬盘容量：" + HD.getAmount());
		System.out.println("硬盘种类：" + HD.getType());
	}
	void setCPU(CPU cpu){
		this.cpu = cpu;
	}
}
public class text{
	public static void main(String args[]){
		CPU cpu = new CPU();
		HardDisk HD = new HardDisk();
		cpu.setSpeed(2000);
		HD.setAmount(500);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
		
	}
}
#实验图片

#实验感想
通过实验熟悉了类的创建和基本数据类型使用，以及类的组合与替代


