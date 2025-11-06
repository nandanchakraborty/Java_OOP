
1.U cant access default class outside its package but u can access public class outside the package
2.only public and default access modifiers can be used in classes. Protected and private cant be used in classes
**//method access modifiers**
1.In the same package u can access everything except private method,only accessible in same class
2.In the same class u can access every method
3.In the different package ,u can only access public method .
4.protected can only be used in same package or subclasses

**_final keyword_**
1.If u make a class final ,nobody can inherit or extend it .
2.If u make any method final ,u cant override it
3.If u make any variable final,u cant change its value not more than ones.
4.If u make any argument final,u cant change it
5.Typically, u can use it in all variables and arguments

**Static variables**

1.It's a Non access package
2.private static  int count =0; look at this.when u will write only "private int count =0",when ever u call the 
getCount method,u will see same value for every instance because it each time it will create its own instance for every
instance of class. When ever u write "private static int count =0" ,it will work on single instance for every class 
instance.

**Static method**
1.If u make any method static,u can access it by using class name.Because it is shared by the class.But if u make method 
nonstatic it only accessible by using class instance
2.In a static method,u cant use non static variables or method but in a instance method ,u can use static variables and
methods
**Nested class**
