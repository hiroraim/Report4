package jp.ac.uryukyu.ie.e175765;

public class Error {
    public static void main(String[] args) {
            try{
                String str = null;
                System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println(e);
                System.out.println(e.getMessage()+"によるエラーが発生しました ");
            }


    }
}