
/** 子类的所有构造方法内部， 第一行会（隐式）自动先调用父类的无参构造函数super()；
 *如果子类构造方法第一行显式调用了父类构造方法，系统就不再调用无参的super()了。
 */
class SuperClass {
  private int n;
  
  //如果父类没有无参构造函数，创建子类时，super()不能编译，除非在构造函数代码体中的第一行显式调用父类有参构造函数。
  SuperClass(){
    System.out.println("SuperClass()");
  }
  
  SuperClass(int n) {
    System.out.println("SuperClass(int n)");
    this.n = n;
  }
}
class SubClass extends SuperClass{
  private int n;
  
  SubClass(){
    super(300); //如果子类构造方法第一行显式调用了父类构造方法，系统就不再调用无参的super()了。
    System.out.println("SubClass");
  }  
  
  public SubClass(int n){
    // super(); //系统会自动隐式先调用父类的无参构造函数 super();
    System.out.println("SubClass(int n):"+n);
    this.n = n;
  }
}
public class TestSuperSub{
  public static void main (String args[]){
    SubClass sc = new SubClass();
    SubClass sc2 = new SubClass(200); 
  }
}

