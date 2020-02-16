import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: 郑可
 * @Date: 2019/12/18 19:05
 * @Desc:
 */
public class Array {
    public static void main(String[] args) {
        /*int incre=2; //容量增加量
        int[] a={1,2,3,4};
        int[] b=new int[a.length+incre];//新数组
        System.arraycopy(a, 0, b, 0, a.length);//将a数组内容复制新数组b
        b[4]=5;//b数组新增元素
        b[5]=6;
        a=b;//改变引用
        System.out.println("扩容后数组a容量为为："+a.length+"  数组a内容：");
        for(int i:a){
            System.out.print(i+"  ");
        }*/

        String[] str = {"a","b","c"};
        List<String> strings = Arrays.asList(str);
        List<String> list = new ArrayList<>(strings);
        list.remove(1);
        System.out.println(list.get(1));
    }
}
