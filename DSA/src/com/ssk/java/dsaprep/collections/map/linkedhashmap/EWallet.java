package com.ssk.java.dsaprep.collections.map.linkedhashmap;

import java.util.LinkedHashMap;

public class EWallet {
    public static void main(String[] args) {
        Wallet userWallet=new Wallet();
        userWallet.setBal(1234,100);
        userWallet.setBal(1122,2000);
        userWallet.setBal(3434,5000);

        System.out.println("Balance of user 1122: ");
        System.out.println(userWallet.getBal(1122));
        System.out.println("Balance of user 1122 after transaction : ");
        userWallet.setBal(1122,1000);
        System.out.println(userWallet.getBal(1122));

    }
}

class Wallet{
    LinkedHashMap<Integer,Integer> walletObj;
    Wallet(){
        walletObj=new LinkedHashMap<>();
    }

    Integer getBal(Integer userId){
        return walletObj.get(userId);
    }

    void setBal(Integer userId, Integer bal){
        walletObj.put(userId,bal);
    }
}

