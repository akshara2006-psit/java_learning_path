// if we want that only B,C CLASS can only extend A class if D or any other class tries to extend the A class then it should give error -> use sealed keyword


sealed class A permits B,C{

}
//  It is compulsory that subclass of sealed class must have one of three keyword final,sealed,non-selaed
 final class B extends A{

}
final class C extends A{

}
// class D extends A{
  //error
// }
// final class D extends A{
  //error
// }
public class Demo_Sealed {
    
}
