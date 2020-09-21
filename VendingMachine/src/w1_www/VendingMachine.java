package w1_www;


import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************");
		System.out.println("* 欢迎使用自动售货机     *");
		System.out.println("*****************");
		User[] userList = new User[2];
		userList[0] = new User("www123","123456","www",true);
		userList[1] = new User("yby456","123456","yby",false);
		Login(userList);
		Goods[] goodsList = new Goods[5];
		goodsList[0] = new Goods("可乐",2.5,100);
		goodsList[1] = new Goods("雪碧",2.5,100);
		goodsList[2] = new Goods("脉动",4.5,100);
		goodsList[3] = new Goods("面包",5.0,100);
		goodsList[4] = new Goods("薯片",4.5,100);
		
		Purchase(goodsList);
		sc.close();

		
	}
	
	
	public static void Login(User[] userList) {
		Scanner sc = new Scanner(System.in);
		Boolean validate = false;
		
		while(!validate){
			System.out.println("Username:");
			String usern = sc.nextLine();
			String pwd;
			for(User u : userList) {
				if(usern.equals(u.getUserName())) {
					System.out.println("Password:");
					pwd = sc.nextLine();
					if(pwd.equals(u.getPassword())){
						if(u.getType() == true) {
							System.out.println("欢迎光临VIP");
							validate = true;
						}
						else {
							System.out.println("欢迎光临");
							validate = true;
						}
					}
					else {
						System.out.println("密码错误");
					}
				}
				else {
					System.out.println("用户不存在");
				}
			}
		}

		sc.close();
	}
	
	public static void Purchase(Goods[] goodsList) {
		Boolean x = true;
		while(x) {
			ShowGoodsList(goodsList);
			x = SelectGoods(goodsList);
			if(x == true) {
				System.out.println("商品号选择错误");
			}
		}
		
		
	}
	
	public static void ShowGoodsList(Goods[] goodsList) {
		System.out.println("############################");
		System.out.println("编号    商品名    价格    库存");
		int i = 1;
		for(Goods g : goodsList) {
			System.out.println(i +"    " + g.getName() + "    " + g.getPrice() + "    " + g.getReserve());
			i++;
		}
		System.out.println("############################");
	}
	
	public static Boolean SelectGoods(Goods[] goodsList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择你想要购买的商品");
		int i = sc.nextInt();
		while(1 == 1) {
			if(i > goodsList.length || i <= 0) {
				return true;
			}
			else {
				break;
			}
		}
		Boolean x = true;
		while(x) {
			x = InputAmount(goodsList,i);
			if(x == true) {
				System.out.println("库存不足");
				return true;
			}
		}
		return true;
	}
	public static Boolean InputAmount(Goods[] goodsList,int number) {
		System.out.println("输入想要购买的商品数");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		if(amount == 0 || amount >goodsList[number -1].getReserve()) {
			return true;
		}
		else {
			Pay(goodsList,number,amount);
			return false;
		}
	}
	public static void Pay(Goods[] goodsList,int number,int amount) {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int addedmoney = 0;
		double sum = goodsList[number -1].getPrice() * amount;
		System.out.println("您购买了  " + goodsList[number-1].getName() + "x" + amount + "  总价：" + sum);
		System.out.println("请投币：");
		Boolean enough = false;
		while(!enough) {
			System.out.println("仅支持5元，10元，50元，100元面额的钞票!");
			addedmoney = sc.nextInt();
			switch(addedmoney) {
			case 5:
				money = (int) (money + addedmoney);
				break;
			case 10:
				money = (int) (money + addedmoney);
				break;
			case 50:
				money = (int) (money + addedmoney);
				break;
			case 100:
				money = (int) (money + addedmoney);
				break;
			default:
				addedmoney = 0;
				continue;
			
			}
				if(money == sum) {
					System.out.println("您投入了" + money + "元");
					enough = true;
					System.out.println("金额正好，感谢惠顾(回车键继续)");
					goodsList[number-1].Purchase(amount);
					new Scanner(System.in).nextLine();
					break;
				}
				else if(money > sum) {
					double change = (double)money - sum;
					System.out.println("您投入了" + money + "元");
					System.out.println("找零" + change + "元,感谢惠顾(回车键继续)");
					enough = true;
					goodsList[number-1].Purchase(amount);
					new Scanner(System.in).nextLine();
					break;
				}
				else if(money < sum) {
					double need = sum - (double)money;
					System.out.println("您投入了" + money + "元");
					System.out.println("还需" + need + "元,请继续投币");
				}
			
		}

		
	}

}
