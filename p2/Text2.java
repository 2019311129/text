package p2;

class HardDisk{
	int amount;
	int getAmount(){
		return amount;
	}
	public void setAmount(int amount){
		this.amount = amount;
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
		System.out.println("����CPU�ٶȣ�" + cpu.getSpeed());
		System.out.println("����Ӳ��������" + HD.getAmount());
	}
	void setCPU(CPU cpu){
		this.cpu = cpu;
	}
}

public class Text2 {

	public static void main(String a[]) {
		// TODO Auto-generated method stub

	}

}
