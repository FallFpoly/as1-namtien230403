/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.as1;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class AS1 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int cn;
        do {
            System.out.println("+------------------------------------------+");
            System.out.println("|              MENU CHUC NANG              |");
            System.out.println("+------------------------------------------+");
            System.out.println("| 1: Nhap danh sach nhan vien              |");
            System.out.println("| 2: Xuat danh sach nhan vien              |");
            System.out.println("| 3: Tim thong tin nhan vien               |");
            System.out.println("| 4: Xoa thong tin nhan vien               |");
            System.out.println("| 5: Cap nhat thong tin nhan vien          |");
            System.out.println("| 6: Tim nhan vien theo khoang luong       |");
            System.out.println("| 7: Sap xep nhan vien theo ho va ten      |");
            System.out.println("| 8: Sap xep nhan vien theo thu nhap       |");
            System.out.println("| 9: Xuat 5 nhan vien co thu nhap cao nhat |");
            System.out.println("| 0: Ket thuc                              |");
            System.out.println("+------------------------------------------+");
            System.out.print("CHON CHUC NANG: ");
            cn = sc.nextInt();
            switch (cn) {
                case 1:
                    System.out.println("Ban chon: Nhap danh sach nhan vien");

                    break;
                case 2:
                    System.out.println("Ban chon: Xuat danh sach nhan vien");

                    break;
                case 3:
                    System.out.println("Ban chon: Tim thong tin nhan vien");

                    break;
                case 4:
                    System.out.println("Ban chon: Xoa thong tin nhan vien");

                    break;
                case 5:
                    System.out.println("Ban chon: Cap nhat thong tin nhan vien");

                    break;
                case 6:
                    System.out.println("Ban chon: Tim nhan vien theo khoang luong");

                    break;
                case 7:
                    System.out.println("Ban chon: Sap xep nhan vien theo ho va ten");

                    break;
                case 8:
                    System.out.println("Ban chon: Sap xep nhan vien theo thu nhap");

                    break;
                case 9:
                    System.out.println("Ban chon: Xuat 5 nhan vien co thu nhap cao nhat");

                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Chon sai ! Vui long chon lai");
                    break;
            }
        } while (cn != 0);
    }
}
