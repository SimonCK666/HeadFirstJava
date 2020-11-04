public class EnhanceFor {
    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};
   
        for(int x : numbers){
           System.out.print(x);
           System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for(String name : names) {
           System.out.print( name );
           System.out.print(",");
        }
     }
}

/*

Java5 中引入了增强的 for 循环，格式如下

    for(声明语句 : 表达式)
    {
        //代码句子
    }



*/
