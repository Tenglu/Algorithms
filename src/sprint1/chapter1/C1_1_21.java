package sprint1.chapter1;
import java.io.*;

public class C1_1_21 {
	public static void main(String[] args){
				try {
	                String encoding="UTF-8";
	                String filePath="C:/Users/liangtl2/Downloads/filedata.txt";
	                File file=new File(filePath);
	                if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
	                    InputStreamReader read = new InputStreamReader(
	                    new FileInputStream(file),encoding);//���ǵ������ʽ
	                    BufferedReader bufferedReader = new BufferedReader(read);
	                    String lineTxt = null;
	                    while((lineTxt = bufferedReader.readLine()) != null){
	                      //  System.out.print(lineTxt);
	                        String attr[]=lineTxt.split("\t");
	                        Double i1=Double.valueOf(attr[1]);
	                        Double i2=Double.valueOf(attr[2]);
	                        System.out.printf("%s"+" "+"%s"+" "+"%s"+" "+"%.3f"+'\n',attr[0],attr[1],attr[2],i1/i2);
	                        //System.out.println(attr[0]+" "+attr[1]+" "+attr[2]);
	                        
	                    }
	                    read.close();
	        }else{
	            System.out.println("�Ҳ���ָ�����ļ�");
	        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	}

}
