
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebPage rootPage1 = new WebPage("\r\n" + "http://alina00.com/taipeicafe/", "Alina 愛琳娜 嗑美食瘋旅遊");		
		WebTree tree1 = new WebTree(rootPage1);
		tree1.root.addChild(new WebNode(new WebPage("http://alina00.com/egghost/","疍宅")));
		tree1.root.addChild(new WebNode(new WebPage("http://alina00.com/beckhome/","貝克宅")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/belindacoffe/","白蓮達")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/uglatte-cafe/","白夜貓子咖啡")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/blog/post/43977946-wood-white-cafe/","木白甜點咖啡店")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/haoxiu/","好休咖啡")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/kiosk/","KiOSK")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/cafeganada/","卡那達咖啡店")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/ciaociao/","悄悄好食")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/realguts/","特有種商行")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/zdaycafe/","休習日 Z.Day.Cafe")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/stone-espresso/","Stone Espresso Bar")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/nihao-cafe-hotel/","NiHao Cafe Hotel 你好咖啡")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/blog/post/45001119-2j-cafe/","2J Cafe")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/slowpacecafe/","慢步調咖啡館")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/breakfastapt/","早餐室 悄悄好食二店")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/now-coffee//","鬧咖啡 NOW Coffee")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/blog/post/44926807-bocy-patisserie-bistro/","BOCY Patisserie & Bistro 寶希甜點好食光")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/l-coffee/","L.Coffee")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/blog/post/44882746-ratiocoffee/","Ratio Coffee")));
		tree1.root.addChild(new WebNode(new WebPage("https://alina00.com/all-day/","ALL DAY ROASTING COMPANY")));
		
		WebPage rootPage2 = new WebPage("\r\n" + "https://www.bella.tw/articles/travel&foodies/21285", "Bella.tw儂濃");	
		WebTree tree2 = new WebTree(rootPage2);
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/20791","延伸閱讀：捷運北投、新北投4間特色咖啡廳推薦！超萌店狗和舊屋改建列必訪名單")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/20781","延伸閱讀：捷運東門站打卡小店推薦！6家咖啡廳、冰店讓你從永康街頭吃到街尾")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/20691","延伸閱讀：《爛醉咖啡》換佈景再度洗版IG！絕美沙灘、度假草屋帶你秒飛熱帶小島")));
		/*tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/18797","starbucks1")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/21312","starbucks2")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/20423","redvelvet")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/21639","chainstores")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/20050","starbucks3")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/design&gadget/21868","eslite1")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/design&gadget/21872","eslite2")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/19003","eslitejp")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/horoscope/21600","horoscope")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/21512","yungan")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/21471","kiehls")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/17197","starbucks4")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/19593","damtsui")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/19041","andong")));
		tree2.root.addChild(new WebNode(new WebPage("https://www.bella.tw/articles/travel&foodies/16763","hsinchu")));*/
		
	
		WebPage rootPage3 = new WebPage("\r\n" + "https://www.mecocute.com/taipei-coffee/", "陳小可的吃喝玩樂");	
		WebTree tree3 = new WebTree(rootPage3);
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/cafeshop/","台北咖啡廳不限時可久坐、有網路wifi上網、插座充電的咖啡館推薦")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/taipei-cat-coffee/","推薦台北有貓咪的咖啡館【貓奴天堂】貓咪坐檯當店長")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/ig-taipei/","IG網紅拍照打卡熱門美食景點推薦！台灣旅遊來這地標吧")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/taipei-ice/","台北冰店推薦，夏天就是要吃冰～熱門冰品推薦")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/xingtian-temple-food/","台北捷運推薦，行天宮站美食推薦，餐廳、咖啡館、日本料理、早餐店")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/shandao-temple-station/","台北捷運推薦，善導寺站美食推薦，早餐、咖啡館、日本料理、日本料理")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/the-cafe-by/","The cafe’ by 想 陽明山")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/cafe-hytte/","Cafe Hytte")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/triangle-garden-cafe/","角公園咖啡 Triangle Garden Cafe")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/steepstairs/","樓梯好陡steepstairs")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/sound-coffee-shop/","初聲咖啡店")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/rebirth-coffee/","瑞帛咖啡Rebirth Coffee")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/woodxwhite/","木白甜點咖啡店")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/uzukicafe/","肆月咖啡 Uzuki Cafe")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/dazzling-cafe/","Dazzling Cafe Badass Babes Club (台北店)")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/ambi-cafe/","無聊咖啡AMBI-CAFE")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/alba-cafe/","艾白旅生 Alba Voyage")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/coffeesmithcake/","時安靜好 ")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/komedas-coffee-taiwan/","コメダ珈琲店台灣首店")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/apreslamousson-cafe/","羅得奧商行。Après la Mousson")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/ctrlf-brunch-cafe/","Ctrl+F Brunch & Cafe")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/green-day/","自然產 GREEN DAY")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/neo-cafe/","妳有咖啡 neo cafe")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/westgatehotel/","永安棧精品酒店")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/flux/","Flux")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/lee-cafe/","LEE café手作烘焙咖啡豆")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/koon-coffee-roasting-studio/","㒭咖啡 自家烘焙工作室")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/e61/","壹陸壹（E61）咖啡場所")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/until2145/","UNTIL 21:45")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/dwaco-coffee/","月半Dwaco 咖啡")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/gongguan-xiang-nong/","窩巷弄")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/matter-cafe/","MATTER CAFE ")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/dayongcafe/","ERC cafe 阿達阿永咖啡廳 中和華夏店")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/little-dream-cafe/","小夢境。Little Dream Cafe’")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/then-espresso/","藍儂說 Then Espresso")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/koya-coffee/","KOYA Coffee")));
		tree3.root.addChild(new WebNode(new WebPage("https://evalilycoco.blogspot.com/2018/05/HungryShop.html","餓店蒸氣吐司")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/the8sa/","象座咖啡")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/fiveyen/","五円·ご緣")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/merci-vielle/","Merci vielle")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/camulet/","貓欸Camulet")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/thewhocafe/","框影咖啡永康店")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/mercicreme/","Merci créme")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/artalleycafe/","藝風巷 Artalley Cafe")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/2730-cafe/","2730 cafe 貳柒參零咖啡館 ")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/noworkbutlatte/","不想上班只好喝拿鐵")));
		tree3.root.addChild(new WebNode(new WebPage("https://www.mecocute.com/gabi/","招金GABi")));
		
		WebPage rootPage4 = new WebPage("\r\n" + "http://omofood.com/labu-cafe/", "食omo〃Food×Fun");		
		WebTree tree4 = new WebTree(rootPage4);
		
		//WebPage rootPage0 = rootPage1;	
		WebTree tree0 = tree1;
	
		
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			int numOfKeywords = scanner.nextInt();
			ArrayList<Keyword> keywords = new ArrayList<Keyword>();
			
			for(int i =0;i<numOfKeywords;i++)
			{
				String name = scanner.next();
				double weight = scanner.nextDouble();
				Keyword k = new Keyword(name, weight);
				keywords.add(k);
			}
			

			tree1.setPostOrderScore(keywords);
			tree1.eularPrintTree();
			tree2.setPostOrderScore(keywords);
			tree2.eularPrintTree();
			tree3.setPostOrderScore(keywords);
			tree3.eularPrintTree();
			tree4.setPostOrderScore(keywords);
			tree4.eularPrintTree();
			tree0.setPostOrderScore(keywords);
			tree0.eularPrintTree();
			
			WebTree trees[] = {tree0,tree1,tree2,tree3,tree4};
			
			for(int i=0;i<3;i++) {
				for(int j=1; j<=3-i; j++) {
					if(trees[j].root.nodeScore < trees[j+1].root.nodeScore ) {
						trees[0]= trees[j+1];
						trees[j+1] = trees[j];
						trees[j]= trees[0];
					}
				}
			}
			for(int i=1;i<=4; i++) {
				System.out.println(trees[i].root.webPage.name+" "+ trees[i].root.nodeScore + trees[i].root.webPage.url);
			}			
		}
		scanner.close();
	}

}


