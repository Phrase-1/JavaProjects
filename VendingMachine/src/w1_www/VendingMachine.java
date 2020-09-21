package w1_www;


import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************");
		System.out.println("* ��ӭʹ���Զ��ۻ���     *");
		System.out.println("*****************");
		User[] userList = new User[2];
		userList[0] = new User("www123","123456","www",true);
		userList[1] = new User("yby456","123456","yby",false);
		Login(userList);
		Goods[] goodsList = new Goods[5];
		goodsList[0] = new Goods("����",2.5,100);
		goodsList[1] = new Goods("ѩ��",2.5,100);
		goodsList[2] = new Goods("����",4.5,100);
		goodsList[3] = new Goods("���",5.0,100);
		goodsList[4] = new Goods("��Ƭ",4.5,100);
		
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
							System.out.println("��ӭ����VIP");
							validate = true;
						}
						else {
							System.out.println("��ӭ����");
							validate = true;
						}
					}
					else {
						System.out.println("�������");
					}
				}
				else {
					System.out.println("�û�������");
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
				System.out.println("��Ʒ��ѡ�����");
			}
		}
		
		
	}
	
	public static void ShowGoodsList(Goods[] goodsList) {
		System.out.println("############################");
		System.out.println("���    ��Ʒ��    �۸�    ���");
		int i = 1;
		for(Goods g : goodsList) {
			System.out.println(i +"    " + g.getName() + "    " + g.getPrice() + "    " + g.getReserve());
			i++;
		}
		System.out.println("############################");
	}
	
	public static Boolean SelectGoods(Goods[] goodsList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ������Ҫ�������Ʒ");
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
				System.out.println("��治��");
				return true;
			}
		}
		return true;
	}
	public static Boolean InputAmount(Goods[] goodsList,int number) {
		System.out.println("������Ҫ�������Ʒ��");
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
		System.out.println("��������  " + goodsList[number-1].getName() + "x" + amount + "  �ܼۣ�" + sum);
		System.out.println("��Ͷ�ң�");
		Boolean enough = false;
		while(!enough) {
			System.out.println("��֧��5Ԫ��10Ԫ��50Ԫ��100Ԫ���ĳ�Ʊ!");
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
					System.out.println("��Ͷ����" + money + "Ԫ");
					enough = true;
					System.out.println("������ã���л�ݹ�(�س�������)");
					goodsList[number-1].Purchase(amount);
					new Scanner(System.in).nextLine();
					break;
				}
				else if(money > sum) {
					double change = (double)money - sum;
					System.out.println("��Ͷ����" + money + "Ԫ");
					System.out.println("����" + change + "Ԫ,��л�ݹ�(�س�������)");
					enough = true;
					goodsList[number-1].Purchase(amount);
					new Scanner(System.in).nextLine();
					break;
				}
				else if(money < sum) {
					double need = sum - (double)money;
					System.out.println("��Ͷ����" + money + "Ԫ");
					System.out.println("����" + need + "Ԫ,�����Ͷ��");
				}
			
		}

		
	}

}
