import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Scanner.*;
class Complex
{
	float real;
	float imag;
	Complex()
	{
		real=0.0f;
		imag=0.0f;
	}
	Complex(float real,float imag)
	{
		this.real=real;
		this.imag=imag;
	}
	Complex(Complex c)
	{
		this.real=c.real;
		this.imag=c.imag;
	}
	Complex add(Complex c)
	{
		Complex temp=new Complex();
		temp.real=c.real+this.real;
		temp.imag=c.imag+this.imag;
		return temp;
	}
	Complex sub(Complex c)
	{
		Complex temp=new Complex();
		temp.real=c.real-this.real;
		temp.imag=c.imag-this.imag;
		return temp;
	}
	void display()
	{
		System.out.println(real+"+i("+imag+")");
	}
	public static void main(String[] args)
	{
	Complex c1=new Complex(25.14f,56.42f);
	Complex c2=new Complex(9.14f,3.27f);
	Complex c3=c1.add(c2);
	c3.display();
	Complex c4=c2.sub(c1);
	c4.display();
	}
}

