package newcoder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.List;
import java.util.*;

/** 
* Created by zhanghuali on 2017年12月19日. 
*/
public class Main {
	public static void print(int index, Object obj)
	{
		System.out.println(String.format("{%d}, %s", index, obj.toString()));
	}
	public static void demoOperation()
	{
		print(1, 5 / 2);
		print(1, 5 * 2);
		print(1, 5 + 2);
		print(1, 5 - 2);
		print(1, 5 << 2);
		print(1, 5 >> 2);
		print(1, 5 & 2);
		print(1, 5 ^ 2);
		print(1, 5 == 2);
		print(1, 5 != 2);
	}
	public static void demoControlFlow()
	{
		int score = 65;
		if(score >80)
		{
			print(1, "A");
		}else if(score < 60) {
			print(2, "B");
		}else {
//			print(3, "C");
		}
		
		String grade = "B";
		switch(grade)
		{
		case "A":
//			print(4, "score > 80");
		default:
//			print(7, "score<60");
		
		}
		
		for (int i=0;i<6;i++)
		{
			if(i==1)
			{
				continue;
			}
			if(i==5)
			{
				break;
			}
			if(i % 2==1)
			{
//				print(8, "i%2=1");
			}
//			print(1, i);
		}
		
		
		String string="hello";
		for (char c:string.toCharArray())
		{
//			print(9, c);
		}
		int target = 20;
		int current = 0;
		while(target>current)
		{
			current+=5;
			if(current==10)
				continue;
			
			print(10, current);
			
		}
		
	}
	
	public static void demoString()
	{
		String str= "hello,hualili";   //一次操作不可变
//		str.substring(beginIndex);
		print(1, str.indexOf("e"));
		print(2, str.charAt(6));
		print(3, str.codePointAt(1));
		print(4, str.compareTo("hello,hualili"));
		print(5, str.compareTo("hello,aualili"));
		print(6, str.compareToIgnoreCase("Hello,hualili"));  //忽略大小写
		print(7,  str.concat("!!"));
		print(8, str.contains("hello"));
		print(9, str.endsWith("hualili"));
		print(10, str.startsWith("hello"));
		print(11, str.lastIndexOf('o'));  //返回元素最后一次出现的位置
		print(12, str.toUpperCase());   //
		print(13, str.replace("o", "a"));
		print(14, str.replaceAll("o|l","a"));
		print(15, str.replaceAll("hello", "hi"));   
		
		
		
		StringBuilder sBuilder= new StringBuilder();
		sBuilder.append("sfd");
		sBuilder.append(true);
		sBuilder.append(1);
		sBuilder.append(1.1);
		print(16, sBuilder.toString());
		print(17, "a"+"b"+String.valueOf(12));   //效率不如StringBulider
		
		
		
	}
	
	
	public static void demoList()
	{
		List<String> strlist = new ArrayList<String>();
		for (int i=0;i<4;i++) 
		{
			strlist.add(String.valueOf(i));
		}
//		print(1, strlist);
//		strlist.remove(0);
		strlist.add(1, "9");  //若是10或者41，则按字典序进行排序，因为String类型中，
//		字符都按字典序排序，即依次从第一个开始比较排序  [0, 1, 10, 2, 3, 8]   [0, 1, 2, 23, 3, 8]
		strlist.add(0, "8");
		
//		print(2, strlist);
//		print(3, strlist.get(2));
		List<String> strlist1=new ArrayList<String>() {{
			add("1");
			add("3");
			add("23");
			add("0");
			add("2");
			add("3");
		}};
		print(9, strlist1);
		Collections.sort(strlist1);
		print(10, strlist1);
		
		
		Collections.sort(strlist);
//		print(4, strlist);
		Collections.sort(strlist,new  Comparator<String>() {
			public int compare(String o1, String o2)
			{
				return o2.compareTo(o1);
			}
		});
//		print(5, strlist);
		Collections.reverse(strlist);
//		print(6, strlist);   
		
		
		int []array = new int[] {1,2,3};
//		print(7, array[1]);
		
		
		
	}
	
	
	public static void demoSet()
	{
		Set<String> strset = new HashSet<String>();
		for (int i=0;i<3;i++)
		{
			strset.add(String.valueOf(i));   //转化为String类型
			strset.add(String.valueOf(i));   //set中不允许重复，故加入两个一样的还是一个。
			strset.add(String.valueOf(i));
		}
		print(1, strset);
		strset.remove("2");
		print(2, strset);
		print(3, strset.contains(4));
		strset.addAll(Arrays.asList(new String[] {"A","B","C"}));
		print(4, strset);
		
		for (String value:strset)
		{
			print(0, value);
		}
		
		
		print(0, strset.isEmpty());
		print(0, strset.size());
	}
	
	
	public static void demoKeyvalue()
	{
		Map<String, String> map1= new HashMap<>();
		for(int i=0;i<4;i++)
		{
			map1.put(String.valueOf(i), String.valueOf(i*i));
		}
		print(0, map1);
		for(Map.Entry<String, String> entry :map1.entrySet())
		{
			print(2, entry.getKey()+":"+entry.getValue());
		}
		print(3, map1.keySet());
		print(4, map1.values());
		print(4, map1.containsKey("2"));
		print(5, map1.containsValue("2"));
		print(6, map1.get("2"));
		map1.replace("1", "A");
		print(8, map1);
		
	}
	
	
	//异常统一格式
	public static void demoEXception()
	{
		try
		{
			print(1, "helol");
			int a=2;
			a=a/0;
			String s=null;
			s.indexOf('a');
		}catch(NullPointerException ex)
		{
			print(1, "nullpointer");
		}
		catch(Exception e)
		{
			print(2, "Exeption");
		}finally
		{
			print(3, "finally");
			//清理工作
		}
	}
	
	public static void demorandom()
	{
		Random random=new Random();  //伪随机数
		random.setSeed(1);  //随机数指定种子以后就不改变了
		for (int i=0;i<3;i++)
		{	
			print(0, random.nextInt(100));
			print(1, random.nextDouble());
		}
		
		List<Integer> list1=Arrays.asList(new Integer[] {1,2,3,4,5});
		print(2, list1);
//		new ArrayList<Integer>();
		Collections.shuffle(list1);   //打乱，随机
		print(3, list1);
		
		
		Date date=new Date();
		print(1, date);
		print(1, date.getTime());
		DateFormat df=new SimpleDateFormat("HH:mm:ss zz yyyy-MM-dd ");   //格式化这个日期
		print(1, df.format(date));
		//默认显示中国格式的日期
		print(2, DateFormat.getDateInstance(DateFormat.FULL).format(date));
		
		print(9, UUID.randomUUID());
		print(10, Math.max(1, 2));
		print(11, Math.ceil(2.1));   //向上取整3.0
		print(12, Math.floor(2.5));   //向下取整2.0
		print(13, Math.log(2.71));     //e
		 
	}
	
	
	
	public static void main(String[]args)
	{
//		System.out.println("hello, world");
//		print(0, "hello,hualili, fighting");
//		demoOperation();
//		demoControlFlow();
//		demoString();
//		demoList();
//		demoSet();
//		demoKeyvalue();
//		demoEXception();
		demorandom();
	}
	

}
