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
		System.out.println("����CPU�ٶȣ�" + cpu.getSpeed());
		System.out.println("����Ӳ��������" + HD.getAmount());
		System.out.println("Ӳ�����ࣺ" + HD.getType());
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

