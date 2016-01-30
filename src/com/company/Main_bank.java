package com.company;

/**
 * Created by uitschool JV on 1/30/2016.
 */
public class Main_bank {
        String name;
        public Main_bank(String name) {
            this.name = name;
        }

    public String getName() {
        return name;
    }
    public class Acount {
           private int balance;
           private int number;

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        int add_money() {
                return balance++;
            }

            int remove_money() {
                return balance--;
            }

            public Acount(int balance, int number) {
                this.balance = balance;
                this.number = number;
            }

            @Override
            public String toString() {
                return "Acount{" +
                        "balance=" + balance +
                        ", number=" + number +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Bank{" +
                    "name='" + name + '\'' +
                    '}';
        }

    public static void main(String[] args) {
        Main_bank privat = new Main_bank("Privat");
    }
}
