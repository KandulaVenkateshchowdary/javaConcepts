package collections;

import java.beans.Customizer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;


//class
public class TestCustomer2 {

	static  ArrayList<Customer> listCreator(ArrayList<Customer> a,ListGen< Customer> listgen){
		ArrayList<Customer> listbyGeneric=new ArrayList<Customer>();

		for(int i=0;i<a.size();i++){
			if(listgen.compareGenericMethod(a.get(i)) != null){
				listbyGeneric.add(listgen.compareGenericMethod(a.get(i)));}
			;}


		return listbyGeneric;

	};
	public static void main(String[] args) {
		ArrayList<Customer> alC=new ArrayList<Customer>();
		alC.add(new Customer("x",Gender.MALE,LocalDate.of(1999,10,9),"x@gmail.com"));
		alC.add(new Customer("y",Gender.FEMALE,LocalDate.of(1998, 12, 4),"y@gmail.com"));
		alC.add(new Customer("z",Gender.MALE,LocalDate.of(2004, 2, 15),"z@gmail.com"));
		alC.add(new Customer("sam",Gender.MALE,LocalDate.of(2006, 4, 25),"sam@gmail.com"));
		alC.add(new Customer("uma",Gender.FEMALE,LocalDate.of(1997, 2, 14),"uma@gmail.com"));
		alC.add(new Customer("rithika",Gender.FEMALE,LocalDate.of(1992, 5, 19),"rithika@gmail.com"));
		alC.add(new Customer("Phani",Gender.MALE,LocalDate.of(1996, 6, 25),"phani@gmail.com"));
		alC.add(new Customer("raj",Gender.MALE,LocalDate.of(1993, 2, 23),"raj@gmail.com"));
		alC.add(new Customer("Hari",Gender.MALE,LocalDate.of(1994, 2, 16),"Hari@gmail.com"));
		alC.add(new Customer("suma",Gender.FEMALE,LocalDate.of(1998, 5, 9),"suma@gmail.com"));


		//		
		//second possibility by using generics
		System.out.println("for generics");
		ArrayList<Customer> list1=listCreator(alC, (x)->{  
			if(x.getName().charAt(0)=='r'){
				return x; }
			return null;
		});//logic passed dynamically
//		ArrayList<Customer> lista=listCreator(alC, (x)->{  
//			if(x.getName().charAt(0)=='r'){
//				return true; }
//			return false;
//		});
		for (Customer customer : list1) {
			System.out.println(customer.getName());

		};
		System.out.println("filter list by age");
		//forAge
		ArrayList<Customer> list2=listCreator(alC, (x)->{
			LocalDate presentDate=LocalDate.now();
			if((presentDate.getYear()-x.getBirthday().getYear())>20){
				return x;
			}
			return null;});//logic passed dynamically
//		ArrayList<Customer> listb=listCreator(alC, (x)->{
//			LocalDate presentDate=LocalDate.now();
//			if((presentDate.getYear()-x.getBirthday().getYear())>20){
//				return true;
//			}
//			return false;});
		for (Customer customer : list2) {
			System.out.println(customer.getName());
			System.out.println(customer.getBirthday());
		}
		//for gender
		System.out.println("filter list by gender");
		ArrayList<Customer> list3=listCreator(alC,  (x)->{
			if(x.getGender().equals(Gender.FEMALE)){
				return x;
			}return null;});//logic passed dynamically
//		ArrayList<Customer> listc=listCreator(alC,  (x)->{
//			if(x.getGender().equals(Gender.FEMALE)){
//				return true;
//			}return false;});
		for (Customer customer : list3) {
			System.out.println(customer.getName());
			System.out.println(customer.getGender());

		}}}




