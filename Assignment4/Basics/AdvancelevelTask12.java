import java.util.*;

public class AdvancelevelTask12 {
    static class Sale {
        int quantity;
        double price;

        Sale(int quantity,double price){
            this.quantity=quantity;
            this.price=price;
        }
    }
    public static List<Sale> generateSalesData(int size){
        Random rand=new Random();
        List<Sale> sales=new ArrayList<>();
        for(int i=0;i<size;i++){
            int qty=rand.nextInt(10)+1;  
            double price=rand.nextDouble()*500; 
            sales.add(new Sale(qty,price));
        }
        return sales;
    }
    public static double singleThreadRevenue(List<Sale> sales){
        double total=0;
        for(Sale s : sales){
            total+=s.quantity*s.price;
        }
        return total;
    }
    static class RevenueWorker extends Thread{
        List<Sale> subList;
        double partialSum=0;

        RevenueWorker(List<Sale> subList){
            this.subList=subList;
        }

        public void run(){
            for(Sale s : subList){
                partialSum+=s.quantity*s.price;
            }
        }

        public double getPartialSum(){
            return partialSum;
        }
    }
    public static double multiThreadRevenue(List<Sale> sales,int threadCount){
        int size=sales.size();
        int chunk=size/threadCount;
        RevenueWorker threads[]=new RevenueWorker[threadCount];

        for(int i=0;i<threadCount;i++){
            int start=i*chunk;
            int end=(i==threadCount-1)?size:(i+1)*chunk;
            threads[i]=new RevenueWorker(sales.subList(start,end));
            threads[i].start();
        }

        double total=0;
        try{
            for(int i=0;i<threadCount;i++){
                threads[i].join();
                total+=threads[i].getPartialSum();
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        return total;
    }
    public static void main(String args[]){
        int size=5_000_000;
        System.out.println("Generating "+size+" sales records...");
        List<Sale> sales=generateSalesData(size);
        System.out.println("Data generation complete.\n");
        long start1=System.currentTimeMillis();
        double singleResult=singleThreadRevenue(sales);
        long end1=System.currentTimeMillis();
        System.out.println("Single-thread total revenue: ₹"+singleResult);
        System.out.println("Time taken (single-thread): "+(end1-start1)+" ms\n");
        int threads=4;
        long start2=System.currentTimeMillis();
        double multiResult=multiThreadRevenue(sales,threads);
        long end2=System.currentTimeMillis();
        System.out.println("Multi-thread total revenue: ₹"+multiResult);
        System.out.println("Time taken ("+threads+" threads): "+(end2-start2)+" ms");
    }
}
