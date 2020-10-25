# Java实验
## 一、实验目的<br></br>
### 基本要求
  - 用类描述计算机中CPU的速度和硬盘的容量。
  + Java中包含四个类，名字分别为PC、CPU、HardDisk、Test。并使Test为主类。
  * CPU类要求getSpeed（）返回speed的值.要求setSpeed(int m)方法将参数m的值赋值给speed。
  + HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount。
  - PC类要求setCPU(CPU c)将参数c的值赋值给cpu，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量。
  
  
  
### 附加要求：
1. 类中定义不少于两个构造方法；
2. 每个类定义不少于2个属性，且属性的类型应该多样化；
3. 根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；
4. 尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。



## 二.实验内容<br></br>
基本要求：完成教材p110第四题关于PC，内存等模拟的程序。根据课堂中关于访问权限的内容，尝试定义属性的修饰符符号，类中定义方法操作属性，避免直接通过“类对象。属性”的形式访问属性值；并且定义的方法内部应该有符合常理的逻辑判断；尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。
### 实验过程
创建测试主类cpu硬盘pc类并赋值
### 实验方法
创建三个类HD，CPU,PC，在测试中创建cpu磁盘pc对象并设置数值cpu类返回速度值，getSpeed赋值给速度；硬盘类返回量值； pc类getCPU赋值给cpu，getHardDisk（硬盘h）赋值给HD。最后text测试代码
### 核心代码
```
package text2;
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
```
## 实验图片
![f37fdcd8640032d529f48e69a2c4afa.png]

## 实验感想
通过实验熟悉了类的创建和基本数据类型使用，以及类的组合与替代


