package day009;
/**
 * ��Ϸ��ɫ��
 * 
 * */
public class Role {
	/** ��Ϸ��ɫ���������� */
	public String name;
	/** �ȼ�*/
	public int level;
	/** ְҵ*/
	public String job;
	
	public Role(){}
	/**
	 * ���췽��
	 * 1��û�з���ֵ
	 * 2.������������һ��
	 * */
	public Role(String name1, int level1, String job1){
		name = name1;
		level = level1;
		job = job1;
	}
	
	public void show(){
		System.out.println(name + "\t" + level + "\t" + job);
	}
	
	/** �ͷż���*/
	public void doSkill(){
		if(name.equals("����")){
			System.out.println("�����ļ���");
		}else if(name.equals("�����")){
			System.out.println("�԰�����һ��");
		}else {
			System.out.println("Ĭ�ϼ���");
		}
	}
}
