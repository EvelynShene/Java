/**
 * BitSet的底层实现是使用long数组作为内部存储结构的，所以BitSet的大小为long类型大小(64位)的整数倍。
 *   BitSet()：创建一个新的位 set，默认大小是64位。
 *   BitSet(int nbits)：创建一个位set，它的初始大小显式表示索引范围在 0 到 nbits-1 的位。
 *   	大于64*n的位则再扩充一个64位
 *   
 * 应用：
 *   用较少的存储空间存储较大的数据量（非负整数）
 *   eg: 存储数组 source=[1,3,6,10]，用int就需要4*4个字节。
 *       用BitSet, 
 *       1，先找出数据中最大值maxvalue=10
 *       2，声明一个BitSet bits,它的size是maxvalue+1=11
 *       3，遍历数据source，bits[source[i]]设置成true。
 *           最后的值是：(0为false;1为true)
 *           bits [0,1,0,1,0,0,1,0,0,0,1]
 *                   1,  3,    6,      10
 *   缺点：
 *   出现的次数信息会丢失。它会对重复的数字过滤，就是说，一个数字出现过超过2次的它都记成1。
 */
import java.util.BitSet;
 
public class BitSetDemo {
 
  public static void main(String args[]) {
	 // 创建两个新的位 set，大小都是64位。（16 < 64, 不足64位规整到64位）
     BitSet bits1 = new BitSet(16); 
     BitSet bits2 = new BitSet(16);
      
     // set some bits
     for(int i=0; i<16; i++) {
        if((i%2) == 0) bits1.set(i);
        if((i%5) != 0) bits2.set(i);
     }
     System.out.println("Initial pattern in bits1: ");
     System.out.println(bits1);
     // Output:{0, 2, 4, 6, 8, 10, 12, 14}
  
     System.out.println("\nInitial pattern in bits2: ");
     System.out.println(bits2);
     // Output:{1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14}
     
     // AND bits
     bits2.and(bits1);
     System.out.println("\nbits2 AND bits1: ");
     System.out.println(bits2);
     // Output: {2, 4, 6, 8, 12, 14} Note: 逻辑与后结果在bits2中体现 
     
     // OR bits
     bits2.or(bits1);
     System.out.println("\nbits2 OR bits1: ");
     System.out.println(bits2);
     // Output: {0, 2, 4, 6, 8, 10, 12, 14}
     
     // XOR bits
     bits2.xor(bits1);
     System.out.println("\nbits2 XOR bits1: ");
     System.out.println(bits2);
     // Output:{}
  }
}
