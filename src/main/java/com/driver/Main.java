package com.driver;

public class Main {
    class Product{
        public int product(int x, int y) {

            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public void main(String[] args) {
        Product p = new Product();

        p.product(10 , 11);
        p.product(10 , 11 , 33);
        p.product(10.8 , 11.9);

    }

}

