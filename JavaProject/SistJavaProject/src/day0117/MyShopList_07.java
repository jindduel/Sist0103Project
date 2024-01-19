package day0117;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShopList_07 {
	
	static final String FILENAME = "C:\\SIST0103\\file\\myshop.txt";
	List<MyShop> list = new ArrayList<MyShop>();
	Scanner sc = new Scanner(System.in);
	
	public MyShopList_07() {
		shopFileRead();
	}
	
	//파일 읽기
	public void shopFileRead() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			while (true) {
				String shop = br.readLine();
				
				if(shop == null) break;
				
				String[] data = shop.split(",");
				
				String sang = data[0];
				int su = Integer.parseInt(data[1]);
				int price = Integer.parseInt(data[2]);
				int total = su * price;
				
				//MyShop 클래스에 저장 1
//				MyShop s1 = new MyShop();
//				s1.setSangpum(sang);
//				s1.setSu(su);
//				s1.setPrice(price);
//				s1.setTotal(total);		
				
				//저장 2
				MyShop s = new MyShop(sang, su, price);
				//s.setTotal(total);
				
				list.add(s);
			}
			
			System.out.println("파일에서 총 " + list.size() + "개의 상품 목록을 가져왔습니다! ");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. ");
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	
	//파일 쓰기
	public void shopFileWrite() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(FILENAME, true);
			
			for(MyShop shop : list) {
				String s = shop.getSangpum().trim() + "," + shop.getSu() + "," + shop.getPrice() + "\n";
				fw.write(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	//MyShop 입력
	public void shopAdd() {
		System.out.println("- 추가할 상품 정보 -");
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		System.out.print("수량 : ");
		int su = Integer.parseInt(sc.nextLine());
		System.out.print("가격 : ");
		int dan = Integer.parseInt(sc.nextLine());
		
		MyShop shop = new MyShop(name, su, dan);
		
		list.add(shop);
		shopFileWrite();
		System.out.println("** 상품 정보가 저장되었습니다. **");
	}
	
	//MyShop 출력
	public void shopAllDatas() {
		if(list.size() == 0) {
			System.out.println("출력할 상품이 없습니다. ");
			return;
		}
		
		System.out.println("                      ** 상품 내역 **");
		System.out.printf("%s\t%10s\t%3s\t%8s\t%8s\n", "번호", "상품명", "수량", "가격", "총금액");
		System.out.println("==========================================================");
		
		int total;
		int num = 0;
		
		for(MyShop shop : list) {
			total = shop.getSu() * shop.getPrice();
			System.out.printf("%2d\t%10s\t%3d개\t%8d원\t%8d원\n", ++num, shop.getSangpum(), shop.getSu(), shop.getPrice(), total);
		}
		System.out.println();
	}
	
	public void deleteFile() {
		//file 객체 생성
		File file = new File(FILENAME);
		
		//파일이 존재한다면 삭제
		if(file.exists()) file.delete();
		
		list.clear();
		
		System.out.println("** 모든 데이터가 삭제되었습니다. **");
	}
	
	public void shopDelete() {
		System.out.println("삭제할 상품명 : ");
		String sang = sc.nextLine();
		
		boolean flag = false;
		
		//중복 상품이 있을 경우 모두 삭제하려면 뒤에서부터 반복 (인덱스가 바뀌는 것을 대비)
		for(int i = list.size() - 1; i >= 0; i--) {
			MyShop shop = list.get(i);
			
			if(shop.getSangpum().equals(sang)) {
				flag = true;
				list.remove(i);
			}
		}
		
		if(flag) {
			System.out.println("삭제되었습니다. ");
		}
		else System.out.println("해당 상품이 없습니다. ");
		
		
	}
	
	//상품 검색
	public void shopSearch() {
		//상품을 입력하면 상품정보 모두 출력
		
		System.out.println("검색할 상품명 입력");
		String sang = sc.nextLine();
		
		boolean flag = false;
		
		System.out.println("** 검색 결과 **");
		
		for(MyShop shop : list) {
			if(shop.getSangpum().contains(sang)) {
				int total = shop.getSu() * shop.getPrice();
				flag = true;
				System.out.println("상품명 : " + shop.getSangpum());
				System.out.println("수량 : " + shop.getSu());
				System.out.println("가격 : " + shop.getPrice());
				System.out.println("총금액 : " + shop.getPrice());
				System.out.println("------------------------");
			}
		}
	}
	
	public void process() {
		int num;
		
		while (true) {
			System.out.println("1. 상품 추가  2. 상품 출력  3. 상품 삭제  4. 상품 검색  0. 종료");
			num = Integer.parseInt(sc.nextLine());
	
			switch (num) {
				case 1:
					shopAdd();
					break;
				case 2:
					shopAllDatas();
					break;
				case 3:
					shopDelete();
					break;
				case 4:
					shopSearch();
					break;
				case 0:
					System.out.println("Shop 정보를 저장하고 종료합니다. ");
					System.exit(0);
					break;
					
				default :
					System.out.println("다시 입력해주세요. ");
					break;
			}	
		}
	}
	
	
	
	public static void main(String[] args) {
		MyShopList_07 msl = new MyShopList_07();
		msl.process();
	}
}
