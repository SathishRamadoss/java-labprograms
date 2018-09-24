//static synchronization class Table1{
	
synchronized static void printTable(int n){ for(int i=1;i<=10;i++){

System.out.println(n*i); try{

Thread.sleep(400); }catch(Exception e){}

}
}

}

class MyThread11 extends Thread{ public void run(){ Table1.printTable(1);

}
}

class MyThread21 extends Thread{ public void run(){ Table1.printTable(10);

}

}

class MyThread31 extends Thread{ public void run(){

Table1.printTable(100);
}

}
 
