package com.example.cricketService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cricket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String player1;
    private String player2;

    public Cricket(){}

    private int play1over1;
    private int play2over1;

    private int play1over2;
    private int play2over2;

    private int play1over3;
    private int play2over3;

    private int play1over4;
    private int play2over4;

    private int play1over5;
    private int play2over5;

    private int play1over6;
    private int play2over6;

    private String winner;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayer2() {
        return player2;
    }
    public String getPlayer1() {
        return player1;
    }
    public void setPlayer1(String player1){
        this.player1=player1;
    }
    public void setPlayer2(String player2){
        this.player2=player2;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner){
        this.winner=winner;
    }

    public int getPlay1over1() {
        return play1over1;
    }

    public void setPlay1over1(int play1over1) {
        this.play1over1 = play1over1;
    }

    public int getPlay2over1() {
        return play2over1;
    }

    public void setPlay2over1(int play2over1) {
        this.play2over1 = play2over1;
    }

    public int getPlay1over2() {
        return play1over2;
    }

    public void setPlay1over2(int play1over2) {
        this.play1over2 = play1over2;
    }

    public int getPlay2over2() {
        return play2over2;
    }

    public void setPlay2over2(int play2over2) {
        this.play2over2 = play2over2;
    }

    public int getPlay1over3() {
        return play1over3;
    }

    public void setPlay1over3(int play1over3) {
        this.play1over3 = play1over3;
    }

    public int getPlay2over3() {
        return play2over3;
    }

    public void setPlay2over3(int play2over3) {
        this.play2over3 = play2over3;
    }

    public int getPlay1over4() {
        return play1over4;
    }

    public void setPlay1over4(int play1over4) {
        this.play1over4 = play1over4;
    }

    public int getPlay2over4() {
        return play2over4;
    }

    public void setPlay2over4(int play2over4) {
        this.play2over4 = play2over4;
    }

    public int getPlay1over5() {
        return play1over5;
    }

    public void setPlay1over5(int play1over5) {
        this.play1over5 = play1over5;
    }

    public int getPlay2over5() {
        return play2over5;
    }

    public void setPlay2over5(int play2over5) {
        this.play2over5 = play2over5;
    }

    public int getPlay1over6() {
        return play1over6;
    }

    public void setPlay1over6(int play1over6) {
        this.play1over6 = play1over6;
    }

    public int getPlay2over6() {
        return play2over6;
    }

    public void setPlay2over6(int play2over6) {
        this.play2over6 = play2over6;
    }
}