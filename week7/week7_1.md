题目内容：

我们在题目说明中给出了一部分代码，你需要在这部分代码的基础上，按照题目说明编写代码，然后将两部分代码一起提交。



设计一个表示分数的类Fraction。这个类用两个int类型的变量分别表示分子和分母。

这个类的构造函数是：



Fraction(int a, int b)

    构造一个a/b的分数。



这个类要提供以下的功能：



double toDouble();

    将分数转换为double

Fraction plus(Fraction r);

    将自己的分数和r的分数相加，产生一个新的Fraction的对象。注意小学四年级学过两个分数如何相加的哈。

Fraction multiply(Fraction r);

    将自己的分数和r的分数相乘，产生一个新的Fraction的对象。

void print();

    将自己以“分子/分母”的形式输出到标准输出，并带有回车换行。如果分数是1/1，应该输出1。当分子大于分母时，不需要提出整数部分，即31/30是一个正确的输出。



注意，在创建和做完运算后应该化简分数为最简形式。如2/4应该被化简为1/2。



你写的类要和以下的代码放在一起，并请勿修改这个代码：



import java.util.Scanner;



public class Main {



	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Fraction a = new Fraction(in.nextInt(), in.nextInt());

		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();

		b.print();

		a.plus(b).print();

		a.multiply(b).plus(new Fraction(5,6)).print();

		a.print();

		b.print();

		in.close();

	}



}



注意，你的类的定义应该这样开始：



class Fraction {



也就是说，在你的类的class前面不要有public。



输入格式:

程序运行时会得到四个数字，分别构成两个分数，依次是分子和分母。



输出格式：

输出一些算式。这些输入和输出都是由Main类的代码完成的，你的代码不要做输入和输出。



输入样例：

2 4 1 3



输出样例：

1/2

1/3

5/6

1

1/2

1/3
