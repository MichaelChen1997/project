import java.util.Scanner;
public class DataManage {
    public int[] insertData() {
        int[] array = new int[9];
        Scanner num = new Scanner(System.in);
        for(int i=0;i<array.length;i++) {
            System.out.println("请输入第"+(i+1)+"个数据：");
            array[i] = num.nextInt();
            while(array[i]==0) {
                System.out.println("插入的数据不能为0");
                System.out.println("请重新输入第" + (i+1)+"个数据");
                array[i] = num.nextInt();
            }
        }
        System.out.println("数据元素为：");
        for(int j=0; j<array.length;j++) {
            System.out.print(array[j]+" ");
        }
        return array;
    }
    public void showData(int[] a, int length) {
        for(int j=0; j<length;j++) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
    }
    public void insertAtArray(int[] a, int n, int k) {
        a[k-1] = n;
        System.out.println("方法3里的数组a的值");
        for(int x:a) {
            System.out.print(x+" ");
        }
    }
    public void divThree(int[] a) {
        String divBy3=" ";
        boolean haveDivBy3=false;
        for(int i=0; i<a.length; i++) {
            if(a[i]%3==0) {
                haveDivBy3=true;
                divBy3=divBy3+a[i]+"  ";
            }
        }
        if(haveDivBy3==true) {
            System.out.println(divBy3);
        }
        else {
            System.out.println("没有能被3整除的数");
        }
        System.out.println();
    }
    public void notice(){
        System.out.println();
        for(int starUp=0;starUp<20;starUp++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("1--插入数据");
        System.out.println("2--显示所有数据");
        System.out.println("3--在指定位置处插入数据");
        System.out.println("4--查询能被3整除的数据");
        System.out.println("0--退出");
        for(int starDown=0;starDown<20;starDown++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("请输入对应数字进行操作");
    }
    public static void main(String[] args) {
        DataManage datamanage = new DataManage();
        datamanage.notice();
        Scanner number = new Scanner(System.in);
        int[] data=null;
        int n = -1;
        while(n !=0){
            switch(n = number.nextInt()) {
                case 1:
                    System.out.println("方法1");
                    data=datamanage.insertData();
                    break;
                case 2:
                    System.out.println("方法2");
                    datamanage.showData(data,data.length);
                    break;
                case 3:
                    System.out.println("方法3");
                    System.out.println("请输入要插入的数据");
                    int num = number.nextInt();
                    System.out.println("请输入要插入的位置");
                    int index = number.nextInt();
                    datamanage.insertAtArray(data,num,index);
                    break;
                case 4:
                    System.out.println("方法4");
                    System.out.println("能被3整除的数据有：");
                    datamanage.divThree(data);
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
            datamanage.notice();
        }
    }
}

