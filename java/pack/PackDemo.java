package pack;

import java.util.Scanner;

/**
 * packageName: pack
 * fileName   : PackDemo
 * author     : choigeonil
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-26   choigeonil    최초 생성
 */
public class PackDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PackApp packApp = new PackApp();

        String res = packApp.getpack();
        System.out.println(res);
    }
}
