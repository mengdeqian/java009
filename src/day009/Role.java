package day009;
/**
 * 游戏角色类
 * 
 * */
public class Role {
	/** 游戏角色的名称属性 */
	public String name;
	/** 等级*/
	public int level;
	/** 职业*/
	public String job;
	
	public Role(){}
	/**
	 * 构造方法
	 * 1。没有返回值
	 * 2.方法名和类名一致
	 * */
	public Role(String name1, int level1, String job1){
		name = name1;
		level = level1;
		job = job1;
	}
	
	public void show(){
		System.out.println(name + "\t" + level + "\t" + job);
	}
	
	/** 释放技能*/
	public void doSkill(){
		if(name.equals("劳拉")){
			System.out.println("劳拉的技能");
		}else if(name.equals("孙悟空")){
			System.out.println("吃俺老孙一棒");
		}else {
			System.out.println("默认技能");
		}
	}
}
