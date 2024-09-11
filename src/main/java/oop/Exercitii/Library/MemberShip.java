package oop.Exercitii.Library;

import java.time.LocalDate;
import java.time.Period;

public class MemberShip {
    private Member member;
    private Book book;
    private String type;
    private int penalty;


    public MemberShip(Member member, Book book, String type,  int penalty) {
        this.member = member;
        this.book = book;
        this.type = type;
        this.penalty = penalty;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }


    void availableDays(){
        LocalDate currentDate = LocalDate.now();
        System.out.println("Data de azi este: "+currentDate);
        if (!(Period.between(currentDate, book.getExpiryDate()).getDays() > 0)) {
            penalty += 5;
            System.out.println("A expirat data de returnare, ai o penalitate de " + penalty);
        } else {
            System.out.println("Au mai ramas "+Period.between(currentDate, book.getExpiryDate()).getDays()+" zile");
        }
    }
}
