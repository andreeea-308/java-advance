package oop.Exercitii.Library;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Pride & Prejuidice", "Jane Austin", 480, LocalDate.of(2024, 2, 5));
        Member member = new Member("Ana", 3456436);
        MemberShip memberShip = new MemberShip(member, book, "VIP", 0);
        memberShip.availableDays();

    }
}
